package com.example.spring_boot_rest_jpa_example.controllers;

import com.example.spring_boot_rest_jpa_example.models.Book;
import com.example.spring_boot_rest_jpa_example.repositories.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// @RequestMapping("/books")
public class BooksController {

  private BookRepository bookRepository;

  public BooksController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @GetMapping("/api/books")
  public List<Book> getall() {

    return bookRepository.findAll();
  }

  @GetMapping("/api/books/{id}")
  public ResponseEntity<Book> getby(@PathVariable Long id) {

    Optional<Book> bookOptional = bookRepository.findById(id);

    if (bookOptional.isPresent()) {
      return ResponseEntity.ok(bookOptional.get());
    }

    return ResponseEntity.notFound().build();

    // Option 2
    // return bookOptional.orElse(null);

    // Option 3, PROGRAMACION FUNCIONAL

    //      return bookOptional.map(ResponseEntity::ok).orElse(()->
    // ResponseEntity.notFound().build());
  }


    @PostMapping("/api/books")
    public ResponseEntity<Book> pot(@RequestBody Book book) {

       var result= bookRepository.save(book);

       return  ResponseEntity.ok(result);
    }
    @PutMapping("/api/books")
    public ResponseEntity<Book> put(@RequestBody Book book) {

      if(book ==null)
          ResponseEntity.badRequest().build();

      Optional<Book> optionalBook = bookRepository.findById(book.getId());

        if(optionalBook.isEmpty())
            ResponseEntity.badRequest().build();

       var result= bookRepository.saveAndFlush(book);

       return  ResponseEntity.ok(result);
    }
}
