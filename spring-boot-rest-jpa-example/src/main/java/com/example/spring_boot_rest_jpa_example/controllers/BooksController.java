package com.example.spring_boot_rest_jpa_example.controllers;

import com.example.spring_boot_rest_jpa_example.models.Book;
import com.example.spring_boot_rest_jpa_example.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/books")
public class BooksController {

    private  BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    @GetMapping("/api/getAll")
    public List<Book> getall(){

        return bookRepository.findAll();
    }

//    @GetMapping("/api/getby/{id}")
//    public Book getby(Long id){
//
//        return bookRepository.findById(id);
//    }

}
