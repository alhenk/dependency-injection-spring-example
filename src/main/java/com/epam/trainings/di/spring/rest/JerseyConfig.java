package com.epam.trainings.di.spring.rest;

import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.inject.Named;


@Named
public class JerseyConfig extends ResourceConfig {

    @Value("${spring.jersey.application-path}")
    private String apiPath;

    public JerseyConfig() {
        register(FightersEndpoint.class);
    }

    @PostConstruct
    public void configureSwagger() {
        packages("io.swagger.jaxrs.listing");
        BeanConfig config = new BeanConfig();
        config.setResourcePackage("com.wktransportservices.technical.rest");
        config.setBasePath(this.apiPath);
        config.setScan(true);
    }

}