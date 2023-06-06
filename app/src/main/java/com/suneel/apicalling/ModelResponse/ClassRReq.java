package com.suneel.apicalling.ModelResponse;
//just for practice
import java.io.Serializable;
import java.lang.String;

public class ClassRReq implements Serializable {
  private String name;

  private String email;
  private String password;

  public ClassRReq(String name,String email,String password){
    this.name=name;
    this.email=email;
    this.password=password;
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

  public void setJob(String job) {
    this.email = email;
  }

  public  String getPassword() {return this.password;}

  public void setPassword(String password) {
    this.password = password;
  }

}
