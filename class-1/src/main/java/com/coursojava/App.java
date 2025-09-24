package com.coursojava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    // Opcion 1 de como crear instancias en Java:

    //     CalculatorService service = new CalculatorService();
    //
    //        System.out.println( service.helloWorld());

    // Opcion 2 usando el contenedor de dependecy que nos devuelve la instancias en Java, usando
    // beans
    // DE ESTA FORMA RECIBIMOS UN OBJECT DE Spring

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");

    System.out.println(calculatorService.helloWorld());

    // EJEMPLO DE COMO CARGAR UN beans dentro de otro beans
    InvoiceService invoiceService = (InvoiceService) context.getBean("invoiceService");

    System.out.println(invoiceService.calculatorService.helloWorld());

    // CONCEPTO:
    //  Los beans por defecto son singleto, se crea el objeto y se reutiliza para toda la
    // aplicacion
    //  Podemos cambiarlo a scode="prototype" si queremos que se cree un nuevo obejto cada
    // vez que la pidan

  }
}
