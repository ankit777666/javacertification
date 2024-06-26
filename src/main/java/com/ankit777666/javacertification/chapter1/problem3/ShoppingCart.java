package com.ankit777666.javacertification.chapter1.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ankit777666.javacertification.chapter1.problem2.Product;

@Component
public class ShoppingCart {
  private final List<Product> items = new ArrayList<>();

  public void addItem(Product item) {
    this.items.add(item);
  }

  public List<Product> getItems() {
    return Collections.unmodifiableList(this.items);
  }
}
