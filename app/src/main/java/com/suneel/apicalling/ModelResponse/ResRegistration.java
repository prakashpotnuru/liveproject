package com.suneel.apicalling.ModelResponse;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class ResRegistration implements Serializable {
  private Integer code;

  private Data data;

  private String message;

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Data getData() {
    return this.data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public static class Data implements Serializable {
    private String Email;

    private String Token;

    private Integer Id;

    private String Name;

    public String getEmail() {
      return this.Email;
    }

    public void setEmail(String Email) {
      this.Email = Email;
    }

    public String getToken() {
      return this.Token;
    }

    public void setToken(String Token) {
      this.Token = Token;
    }

    public Integer getId() {
      return this.Id;
    }

    public void setId(Integer Id) {
      this.Id = Id;
    }

    public String getName() {
      return this.Name;
    }

    public void setName(String Name) {
      this.Name = Name;
    }
  }
}
