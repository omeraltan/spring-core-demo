package com.core.demo.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private Car car;

    @Autowired
    public CarController(Car car) {
        this.car = car;
    }

    @GetMapping("/car")
    public String getDailyWorkout(){
        return car.getDailyProduct();
    }
}
