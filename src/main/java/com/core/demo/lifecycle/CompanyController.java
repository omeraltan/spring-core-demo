package com.core.demo.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    private Company company;

    @Autowired
    public CompanyController(@Qualifier("apple") Company company) {
        this.company = company;
    }

    @GetMapping("/company")
    public String getCompanyInformation(){
        return company.getCompanyInformation();
    }
}
