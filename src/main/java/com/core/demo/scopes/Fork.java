package com.core.demo.scopes;

import org.springframework.stereotype.Component;

@Component
public class Fork implements Utensils{
    @Override
    public String getDailyUsedKitchenEquipment() {
        return "There are 5 forks";
    }
}
