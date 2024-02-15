package com.core.demo.qualifiers;

import org.springframework.stereotype.Component;

@Component // The class is marked as a bean.
public class CrickotCoach implements CoachBase {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}
