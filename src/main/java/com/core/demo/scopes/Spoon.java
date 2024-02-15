package com.core.demo.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Spoon implements Utensils{
    @Override
    public String getDailyUsedKitchenEquipment() {
        return "There are 4 spoons";
    }
}
