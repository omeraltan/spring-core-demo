package com.core.demo.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chevrolet implements Car{
    @Override
    public String getDailyProduct() {
        return "Chevrolet have production 50 vehicles daily";
    }
}
