package com.ankit777666.javacertification.problem1;

public class SequenceWithDao {
  private final String id;
  private final String prefix;
  private final String suffix;

  public SequenceWithDao(String id, String prefix, String suffix) {
    this.id = id;
    this.prefix = prefix;
    this.suffix = suffix;
  }

  public String getId() {
    return this.id;
  }

  public String getPrefix() {
    return this.prefix;
  }

  public String getSuffix() {
    return this.suffix;
  }

}
