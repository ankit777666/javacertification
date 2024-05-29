/**
 * Create POJOs by invoking the constructor
 */

package com.ankit777666.javacertification.problem2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {
    var config = ShopConfiguration.class;

    try (var context = new AnnotationConfigApplicationContext(config)) {
      var aaa = context.getBean("aaa", Product.class);
      var cdrw = context.getBean("cdrw", Product.class);

      System.out.println("aaa --> " + aaa);
      System.out.println("cdrw --> " + cdrw);
    }
  }
}
