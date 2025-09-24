package com.coursojava;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {


    public CalculatorService() {
        System.out.println("Ejecutando el Constructor CalculatorService");
    }

    public String helloWorld(){
        return  "Hello World 2 !";
    }
}
