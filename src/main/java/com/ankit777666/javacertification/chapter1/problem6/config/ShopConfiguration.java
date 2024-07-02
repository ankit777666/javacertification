package com.ankit777666.javacertification.chapter1.problem6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ankit777666.javacertification.chapter1.problem6.Battery;
import com.ankit777666.javacertification.chapter1.problem6.Cashier;
import com.ankit777666.javacertification.chapter1.problem6.Disc;
import com.ankit777666.javacertification.chapter1.problem6.Product;

@Configuration
@ComponentScan("com.ankit777666.javacertification.chapter1.problem6")
public class ShopConfiguration {
  @Bean
  public Product aaa() {
    return new Battery("AAA", 2.5, true);
  }

  @Bean
  public Product cdrw() {
    return new Disc("CD-RW", 1.5, 700);
  }

  @Bean
  public Product dvdrw() {
    return new Disc("DVD-RW", 3.0, 4700);
  }

  @Bean
  public Cashier cashier() {
    var path = System.getProperty("java.io.tmpdir") + "/cashier";
    return new Cashier("checkout", path);
  }
}
