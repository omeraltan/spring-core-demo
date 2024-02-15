package com.core.demo.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController3 {

    // define a private field for the dependency
    private Coach3 myCoach;

    @Autowired
    public void setCoach(Coach3 theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout3")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
