package com.ankit777666.javacertification.chapter1.problem2;

public class Battery extends Product {
  private final boolean rechargable;

  public Battery(String name, double price, boolean rechargable) {
    super(name, price);
    this.rechargable = rechargable;
    // TODO Auto-generated constructor stub
  }

  public boolean isRechargable() {
    return this.rechargable;
  }

  @Override
  public String toString() {
    var msg = super.toString() + ", rechargable = %b";
    return String.format(msg, this.rechargable);
  }

}
