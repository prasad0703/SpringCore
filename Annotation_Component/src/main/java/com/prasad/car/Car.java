package com.prasad.car;

import com.prasad.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Engine engine;

    public void printData(){
        System.out.println("car engine model: "+engine.getModelYear());
    }
}
