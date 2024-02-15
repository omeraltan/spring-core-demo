package com.core.demo.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements CoachBase {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
