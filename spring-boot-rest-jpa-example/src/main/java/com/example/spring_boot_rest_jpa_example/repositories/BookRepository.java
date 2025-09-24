package com.example.spring_boot_rest_jpa_example.repositories;

import org.springframework.stereotype.Repository;
import com.example.spring_boot_rest_jpa_example.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
