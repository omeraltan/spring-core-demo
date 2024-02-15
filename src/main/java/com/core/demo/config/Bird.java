package com.core.demo.config;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Animals {
    @Override
    public String getAnimalInformation() {
        return "There are 4 birds";
    }
}
