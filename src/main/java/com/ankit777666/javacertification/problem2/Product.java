package com.ankit777666.javacertification.problem2;

public abstract class Product {
  private final String name;
  private final double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", price='" + getPrice() + "'" +
        "}";
  }

}
