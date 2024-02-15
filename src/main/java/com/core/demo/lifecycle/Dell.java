package com.core.demo.lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Dell implements Company{

    @Override
    public String getCompanyInformation() {
        return "We have 200 different computer";
    }
}
