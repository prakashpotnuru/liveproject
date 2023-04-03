package com.suneel.apicalling.ModelResponse;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class ReqRegistration implements Serializable {
  private int password;

  private String name;

  public ReqRegistration( String name, String email,int password) {
    this.password = password;
    this.name = name;
    this.email = email;
  }

  private String email;

  public int getPassword() {
    return this.password;
  }

  public void setPassword(int password) {
    this.password = password;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
