package com.core.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalsController {

    private Animals animals;

    @Autowired
    public AnimalsController(@Qualifier("elephant") Animals animals) {
        this.animals = animals;
    }


    @GetMapping("/animals")
    public String getAnimalInformation(){
        return animals.getAnimalInformation();
    }

}
