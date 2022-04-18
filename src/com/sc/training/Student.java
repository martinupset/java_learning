package com.sc.training;

public class Student {
  //1. properties => attr
  //2.fns
  private Integer id;
  private String name;
  //double: decimal
  private Double grade;

  //name: fn=> v. attrs: n.
  public void study() {
    //sout=> System.out.println
    System.out.println(id + " is studying");
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", grade=" + grade +
            '}';
  }

  public Double getGrade() {
    return grade;
  }

  public void setGrade(Double grade) {
    this.grade = grade;
  }
}
