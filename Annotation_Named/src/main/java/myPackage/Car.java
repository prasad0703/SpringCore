package myPackage;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class Car {

    @Resource
    Engine engine;

    public void printData(){
        System.out.println("car engine model: "+engine.getModelYear());
    }
}
