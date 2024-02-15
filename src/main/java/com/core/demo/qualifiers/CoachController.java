package com.core.demo.qualifiers;

import com.core.demo.constructor.injection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    // define a private field for the dependency
    private CoachBase myCoach;

    // define a constructor for dependency injection
    @Autowired
    public CoachController(@Qualifier("baseballCoach") CoachBase theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/couch")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
