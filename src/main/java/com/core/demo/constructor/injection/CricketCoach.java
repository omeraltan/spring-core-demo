package com.core.demo.constructor.injection;

import org.springframework.stereotype.Component;

@Component // The class is marked as a bean.
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
