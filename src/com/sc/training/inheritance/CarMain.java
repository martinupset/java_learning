package com.sc.training.inheritance;

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.setNumberOfWheels(4);
    c1.setColor("green");
    c1.setName("Audi");
    System.out.println(c1);
  }
}
