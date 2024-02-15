package com.core.demo.primary;

import org.springframework.stereotype.Component;

@Component
public class Fiat implements Car{

    @Override
    public String getDailyProduct() {
        return "Fiat have production 60 vehicles daily";
    }
}
