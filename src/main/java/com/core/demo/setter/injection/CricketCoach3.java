package com.core.demo.setter.injection;

import org.springframework.stereotype.Component;

@Component // The class is marked as a bean.
public class CricketCoach3 implements Coach3 {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
