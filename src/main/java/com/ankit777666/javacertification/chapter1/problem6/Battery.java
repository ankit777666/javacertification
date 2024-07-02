package com.ankit777666.javacertification.chapter1.problem6;

public class Battery extends Product {

  private final boolean rechargeable;

  public Battery(String name, double price, boolean rechargeable) {
    super(name, price);
    this.rechargeable = rechargeable;
  }

  public boolean isRechargeable() {
    return rechargeable;
  }

  @Override
  public String toString() {
    String msg = super.toString() + ", rechargeable=%b";
    return String.format(msg, this.rechargeable);
  }
}
