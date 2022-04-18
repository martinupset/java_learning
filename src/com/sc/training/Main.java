package com.sc.training;

public class Main {
  //psvm => public static void main
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setId(1);
    s1.setName("martin");
    s1.setGrade(9.8);
    s1.study();

    Student s2 = new Student();
    s2.setName("mohd");
    s2.setId(2);
    s2.setGrade(8.8);
    s2.study();
    //s2: object => address in RAM
    //sout => run toString fn
    System.out.println(s2);
  }
}
