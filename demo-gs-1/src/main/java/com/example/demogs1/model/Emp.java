package com.example.demogs1.model;

public class Emp {
  private Long id;
  private String name;
  private Double salary;
  private Boolean isPermanent;

  public Emp(Long id, String name, Double salary, Boolean isPermanent) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.isPermanent = isPermanent;
  }

  public Emp(){
    
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Boolean getPermanent() {
    return isPermanent;
  }

  public void setPermanent(Boolean permanent) {
    isPermanent = permanent;
  }
}
