package com.example.jpa_example;

import com.example.jpa_example.models.Car;
import com.example.jpa_example.repositories.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaExampleApplication {

  public static void main(String[] args) {
    var applicationContext= SpringApplication.run(JpaExampleApplication.class, args);

    var respository= applicationContext.getBean(CarRepository.class);

    System.out.println("FIND");
    System.out.println("Numero de registros en la base de datos es:" + respository.count());

    //Crear y almacenar en Base de datos

      Car toyota = new Car(null, 2010, "Prius", "Toyota");

      respository.save(toyota);

      System.out.println("Numero de registros en la base de datos es: " + respository.count());

    System.out.println(respository.findAll());
  }
}
