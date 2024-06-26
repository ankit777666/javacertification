package com.ankit777666.javacertification.chapter1.problem4;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class Runner {
  public static void main(String[] args) throws IOException {
    var resource = new ClassPathResource("discount.properties");
    var props = PropertiesLoaderUtils.loadProperties(resource);
    System.out.println("Dont forget your discount");
    System.out.println(props);

  }
}
