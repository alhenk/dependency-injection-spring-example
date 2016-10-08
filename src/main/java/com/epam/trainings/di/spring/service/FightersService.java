package com.epam.trainings.di.spring.service;


import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FightersService {
    public List<String> getFightersNames() {
        return Lists.newArrayList("Po", "Tigress", "Monkey", "Oogway");
    }
}
