package com.core.demo.primary;

import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Car{

    @Override
    public String getDailyProduct() {
        return "Mercedes have production 20 vehicles daily";
    }
}
