package com.core.demo.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtensilsController {

    private Utensils utensils;
    private Utensils anotherUtensils;
    @Autowired
    public UtensilsController(@Qualifier("spoon") Utensils utensils, @Qualifier("spoon") Utensils anotherUtensils) {
        this.utensils = utensils;
        this.anotherUtensils = anotherUtensils;
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: utensils == anotherUtensils, " + (utensils == anotherUtensils);
    }
}
