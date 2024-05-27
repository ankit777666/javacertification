package com.ankit777666.javacertification.problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Problem1 {

  public static void main(String args[]) {
    var config = SequenceConfiguration.class;
    try (var context = new AnnotationConfigApplicationContext(config)) {
      var generator = context.getBean(Sequence.class);
      System.out.println("generator.nextValue() -> " + generator.nextValue());
      System.out.println("generator.nextValue() -> " + generator.nextValue());

    }

    ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
    // Sequence generator = (Sequence) context.getBean("sequence1");
    Sequence generator = context.getBean("sequence", Sequence.class);
    System.out.println("generator.nextValue() ---> " + generator.nextValue());
    System.out.println("generator.nextValue() ---> " + generator.nextValue());

  }

}
