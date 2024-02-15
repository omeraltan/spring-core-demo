package com.core.demo.config;

import org.springframework.stereotype.Component;


public class Elephant implements Animals {

    public Elephant() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getAnimalInformation() {
        return "There are 5 elephants";
    }
}
