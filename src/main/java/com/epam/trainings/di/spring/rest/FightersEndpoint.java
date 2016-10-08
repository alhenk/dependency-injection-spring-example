package com.epam.trainings.di.spring.rest;

import com.epam.trainings.di.spring.service.FightersService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Service
@Path("/fighters")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api("Fighters api")
public class FightersEndpoint {
    private final FightersService fightersService;

    @Inject
    public FightersEndpoint(FightersService fightersService) {
        this.fightersService = fightersService;
    }

    @GET
    public List<String> getFightersNames() {
        return fightersService.getFightersNames();
    }

}
