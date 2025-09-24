package com.example.spring_boot_rest_jpa_example.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Book")
public class Book {

  // Atributos
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String author;

  private String title;

  private Integer pages;

  private Double price;

  private LocalDate realeaseDate;

  private Boolean online;

  // Constructores

  public Book() {}

  public Book(
      Long id,
      String author,
      String title,
      Integer pages,
      Double price,
      LocalDate realeaseDate,
      Boolean online) {
    this.id = id;
    this.author = author;
    this.title = title;
    this.pages = pages;
    this.price = price;
    this.realeaseDate = realeaseDate;
    this.online = online;
  }

  // Gets and Sets

  public Long id() {
    return id;
  }

  public Book setId(Long id) {
    this.id = id;
    return this;
  }

  public String author() {
    return author;
  }

  public Book setAuthor(String author) {
    this.author = author;
    return this;
  }

  public String title() {
    return title;
  }

  public Book setTitle(String title) {
    this.title = title;
    return this;
  }

  public Integer pages() {
    return pages;
  }

  public Book setPages(Integer pages) {
    this.pages = pages;
    return this;
  }

  public Double price() {
    return price;
  }

  public Book setPrice(Double price) {
    this.price = price;
    return this;
  }

  public LocalDate realeaseDate() {
    return realeaseDate;
  }

  public Book setRealeaseDate(LocalDate realeaseDate) {
    this.realeaseDate = realeaseDate;
    return this;
  }

  public Boolean online() {
    return online;
  }

  public Book setOnline(Boolean online) {
    this.online = online;
    return this;
  }
}
