package com.core.demo.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements CoachBase {
    @Override
    public String getDailyWorkout() {
        return "Practice your bachand volley";
    }
}
