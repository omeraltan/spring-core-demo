package com.core.demo.primary;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car{
    @Override
    public String getDailyProduct() {
        return "Toyota have production 30 vehicles daily";
    }
}
