package com.ankit777666.javacertification.problem1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Problem1 {

  public static void main(String args[]) {
    var config = SequenceConfiguration.class;
    try (var context = new AnnotationConfigApplicationContext(config)) {
      var generator = context.getBean(Sequence.class);
      System.out.println("generator.nextValue() -> " + generator.nextValue());
      System.out.println("generator.nextValue() -> " + generator.nextValue());

    }
  }

}
