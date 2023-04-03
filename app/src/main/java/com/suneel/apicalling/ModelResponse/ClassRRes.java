package com.suneel.apicalling.ModelResponse;

import java.io.Serializable;

public class ClassRRes implements Serializable {
  private String createdAt;

  private String name;

  private String id;

  private String job;

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}
