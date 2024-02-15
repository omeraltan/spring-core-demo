package com.core.demo.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements CoachBase {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
