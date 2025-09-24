package com.example.spring_boot_rest_jpa_example;

import com.example.spring_boot_rest_jpa_example.models.Book;
import com.example.spring_boot_rest_jpa_example.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringBootRestJpaExampleApplication {

  public static void main(String[] args) {

//    SpringApplication.run(SpringBootRestJpaExampleApplication.class, args);
        ApplicationContext context =
     SpringApplication.run(SpringBootRestJpaExampleApplication.class, args);

        BookRepository repository = context.getBean(BookRepository.class);

        // CRUD

        // Recupertar todos los libros
        System.out.println("Numero de Libros en DB: " + repository.findAll().size());

        // Crear Book
        Book book =
            new Book(null, "Jose Miguel Trinidad", "Spring Boot", 450, 4500.00, LocalDate.now(),
     true);
        Book book2 =
            new Book(
                null, "Jose Miguel Trinidad 2", "Spring Boot 2", 400, 4500.00, LocalDate.now(),
     true);

        // Almacenar un libro
        repository.save(book);
        repository.save(book2);

        // Recupertar todos los libros
        System.out.println("Numero de Libros en DB: " + repository.findAll().size());

        // Borrar un libro
//        repository.deleteById(1L);

        // Recupertar todos los libros
        System.out.println("Numero de Libros en DB: " + repository.findAll().size());
  }
}
