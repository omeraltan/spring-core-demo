package com.core.demo.component.scanning.rest;

import com.core.demo.constructor.injection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired

    public DemoController2(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout2")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
