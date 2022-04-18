package com.sc.training.inheritance;

public class Wheel implements Shape, Machine{

  @Override
  public void perform() {
    System.out.println("perform running");
  }

  @Override
  public void printShape() {
    System.out.println("circular");
  }

  @Override
  public void drawShape() {
    System.out.println("circular");
  }
}
