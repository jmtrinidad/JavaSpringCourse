package com.example.jpa_example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

  // Atributes
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer yeah;

  private String model;

  private String manufacturer;

  // Constructores
  public Car() {}

  public Car(Long id, Integer yeah, String model, String manufacturer) {
    this.id = id;
    this.yeah = yeah;
    this.model = model;
    this.manufacturer = manufacturer;
  }

  // Get and Set
  public Long id() {
    return id;
  }

  public Car setId(Long id) {
    this.id = id;
    return this;
  }

  public Integer yeah() {
    return yeah;
  }

  public Car setYeah(Integer yeah) {
    this.yeah = yeah;
    return this;
  }

  public String model() {
    return model;
  }

  public Car setModel(String model) {
    this.model = model;
    return this;
  }

  public String manufacturer() {
    return manufacturer;
  }

  public Car setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  // toString
  @Override
  public String toString() {
    return "Car{"
        + "id="
        + id
        + ", yeah="
        + yeah
        + ", model='"
        + model
        + '\''
        + ", manufacturer='"
        + manufacturer
        + '\''
        + '}';
  }
}
