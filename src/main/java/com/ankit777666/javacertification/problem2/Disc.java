package com.ankit777666.javacertification.problem2;

public class Disc extends Product {
  private final int capacity;

  public Disc(String name, double price, int capacity) {
    super(name, price);
    this.capacity = capacity;
    // TODO Auto-generated constructor stub
  }

  public int getCapacity() {
    return this.capacity;
  }

  @Override
  public String toString() {
    var msg = super.toString() + ", capacity=%dMB";
    return String.format(msg, this.capacity);
  }

}
