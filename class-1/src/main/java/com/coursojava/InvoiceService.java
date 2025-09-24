package com.coursojava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InvoiceService {

    // Atributos
      CalculatorService calculatorService;

    @Value("Factura Calculator 300")
    String name;

    // Constructores
    public InvoiceService(CalculatorService calculatorService) {

        System.out.println("Ejecutando Constructor de InvoiceService");

        this.calculatorService = calculatorService;
        this.name = name;
    }

    // Metodos

}
