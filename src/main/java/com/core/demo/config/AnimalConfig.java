package com.core.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {

    @Bean("elephant")
    public Animals getAnimal(){
        return new Elephant();
    }

}
