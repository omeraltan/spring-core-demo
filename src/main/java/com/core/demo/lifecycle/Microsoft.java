package com.core.demo.lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Microsoft implements Company{

    @Override
    public String getCompanyInformation() {
        return "We have different 100 computer";
    }
}
