/**
 * Customize POJO Initialization and Destruction 
with Annotations
 */

package com.ankit777666.javacertification.chapter1.problem5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ankit777666.javacertification.chapter1.problem5.Config.ShopConfiguration;

public class Runner {
  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(ShopConfiguration.class)) {

      var aaa = context.getBean("aaa", Product.class);
      var cdrw = context.getBean("cdrw", Product.class);
      var dvdrw = context.getBean("dvdrw", Product.class);

      var cartProvider = context.getBeanProvider(ShoppingCart.class);
      var cart1 = cartProvider.getIfAvailable();
      cart1.addItem(aaa);
      cart1.addItem(cdrw);
      System.out.println("Shopping cart 1 contains " + cart1.getItems());

      var cart2 = cartProvider.getIfAvailable();
      cart2.addItem(dvdrw);
      System.out.println("Shopping cart 2 contains " + cart2.getItems());

      var cashier = context.getBean(Cashier.class);
      cashier.checkout(cart1);
      cashier.checkout(cart2);
    }

  }
}
