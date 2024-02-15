package com.core.demo.config;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animals {
    @Override
    public String getAnimalInformation() {
        return "There are 3 dogs";
    }
}
