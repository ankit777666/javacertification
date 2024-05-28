package com.ankit777666.javacertification.problem1;

public interface SequenceDao {
  SequenceWithDao getSequenceWithDao(String sequenceId);

  int getNextValue(String sequenceId);

}
