package com.ankit777666.javacertification.chapter1.problem3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ankit777666.javacertification.chapter1.problem2.Battery;
import com.ankit777666.javacertification.chapter1.problem2.Disc;
import com.ankit777666.javacertification.chapter1.problem2.Product;

@Configuration
@ComponentScan("com.ankit777666.javacertification.chapter1.problem3")
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
    return new Disc("DVD-RW", 3.0, 4900);
  }

}
