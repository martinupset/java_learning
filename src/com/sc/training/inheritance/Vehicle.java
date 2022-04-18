package com.sc.training.inheritance;

public class Vehicle {
  private Integer numberOfWheels;
  private String color;
  private String name;

  public Integer getNumberOfWheels() {
    return numberOfWheels;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "numberOfWheels=" + numberOfWheels +
            ", color='" + color + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  public void setNumberOfWheels(Integer numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
