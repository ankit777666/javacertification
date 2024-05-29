package com.ankit777666.javacertification.chapter1.problem1;

public interface SequenceDao {
  SequenceWithDao getSequenceWithDao(String sequenceId);

  int getNextValue(String sequenceId);

}
