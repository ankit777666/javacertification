package com.ankit777666.javacertification.chapter1.problem1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao {

  private final Map<String, SequenceWithDao> sequencesWithDao = new ConcurrentHashMap<>();
  private final Map<String, AtomicInteger> values = new ConcurrentHashMap<>();

  SequenceDaoImpl() {
    sequencesWithDao.put("IT", new SequenceWithDao("IT", "30", "A"));
    values.put("IT", new AtomicInteger(10000));
  }

  @Override
  public SequenceWithDao getSequenceWithDao(String sequenceId) {
    // TODO Auto-generated method stub
    return sequencesWithDao.get(sequenceId);
  }

  @Override
  public int getNextValue(String sequenceId) {
    // TODO Auto-generated method stub
    var value = values.get(sequenceId);
    return value.getAndIncrement();
  }

}
