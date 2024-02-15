package com.core.demo.scopes;

import org.springframework.stereotype.Component;

@Component
public class Knife implements Utensils{
    @Override
    public String getDailyUsedKitchenEquipment() {
        return "There are 6 knives";
    }
}
