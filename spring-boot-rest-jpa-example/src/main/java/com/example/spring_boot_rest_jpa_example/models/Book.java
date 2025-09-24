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

  public Long getId() {
    return id;
  }

  public Book setId(Long id) {
    this.id = id;
    return this;
  }

  public String getAuthor() {
    return author;
  }

  public Book setAuthor(String author) {
    this.author = author;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Book setTitle(String title) {
    this.title = title;
    return this;
  }

  public Integer getPages() {
    return pages;
  }

  public Book setPages(Integer pages) {
    this.pages = pages;
    return this;
  }

  public Double getPrice() {
    return price;
  }

  public Book setPrice(Double price) {
    this.price = price;
    return this;
  }

  public LocalDate getRealeaseDate() {
    return realeaseDate;
  }

  public Book setRealeaseDate(LocalDate realeaseDate) {
    this.realeaseDate = realeaseDate;
    return this;
  }

  public Boolean getOnline() {
    return online;
  }

  public Book setOnline(Boolean online) {
    this.online = online;
    return this;
  }
}
