package com.ankit777666.javacertification.chapter1.problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy
public class ShoppingCart {
  private final List<Product> items = new ArrayList<>();

  public void addItem(Product item) {
    this.items.add(item);
  }

  public List<Product> getItems() {
    return Collections.unmodifiableList(this.items);
  }
}
