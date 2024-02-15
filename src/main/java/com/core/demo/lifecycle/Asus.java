package com.core.demo.lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Asus implements Company{

    @Override
    public String getCompanyInformation() {
        return "We have 300 different computer";
    }
}
