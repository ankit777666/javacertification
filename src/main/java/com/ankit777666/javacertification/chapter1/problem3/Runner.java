/**
 * Set POJO's Scope with the @Scope Annotation
 */

package com.ankit777666.javacertification.chapter1.problem3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ankit777666.javacertification.chapter1.problem2.Product;

public class Runner {
  public static void main(String[] args) {
    var cfg = ShopConfiguration.class;
    try (var context = new AnnotationConfigApplicationContext(cfg)) {
      var aaa = context.getBean("aaa", Product.class);
      var cdrw = context.getBean("cdrw", Product.class);
      var dvdrw = context.getBean("dvdrw", Product.class);

      var cart1 = context.getBean(ShoppingCart.class);
      cart1.addItem(aaa);
      cart1.addItem(cdrw);
      System.out.println("Shopping cart1 contains---> " + cart1.getItems());

      var cart2 = context.getBean(ShoppingCart.class);
      cart2.addItem(dvdrw);
      System.out.println("Shopping cart2 contains---> " + cart2.getItems());

    }
  }

}
