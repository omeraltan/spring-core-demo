package com.core.demo.config;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animals {
    @Override
    public String getAnimalInformation() {
        return "There are one cat";
    }
}
