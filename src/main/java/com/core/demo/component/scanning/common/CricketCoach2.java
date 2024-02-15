package com.core.demo.component.scanning.common;

import org.springframework.stereotype.Component;

@Component // The class is marked as a bean.
public class CricketCoach2 implements Coach2 {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
