package com.ankit777666.javacertification.chapter1.problem4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ankit777666.javacertification.chapter1.problem2.Disc;
import com.ankit777666.javacertification.chapter1.problem2.Product;

@Configuration
@PropertySource("classpath:discount.properties")
@ComponentScan("com.ankit777666.javacertification.chapter1.problem4")
public class ShopConfigration {

  @Value("${endofyear.discount:0}")
  private double specialEndOfyearDiscountField;

  public static PropertySourcesPlaceholderConfigurer pspc() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public Product dvdrw() {
    return new Disc("DVD-RW", 1.5, 4700, specialEndOfyearDiscountField);
  }

}
