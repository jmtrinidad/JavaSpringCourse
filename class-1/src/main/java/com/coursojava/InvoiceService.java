package com.coursojava;

public class InvoiceService {

    // Atributos
    private CalculatorService calculatorService;
    String name;

    // Constructores
    public InvoiceService(CalculatorService calculatorService, String name) {

        System.out.println("Ejecutando Constructor de InvoiceService");

        this.calculatorService = calculatorService;
        this.name = name;
    }

    // Metodos

}
