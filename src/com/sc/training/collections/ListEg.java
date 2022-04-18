package com.sc.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEg {
  public static void main(String[] args) {
    //list => interface; arraylist => implements
    List<String> countries = new ArrayList<>();
    countries.add("UK");
    countries.add("US");
    System.out.println(countries);
    System.out.println(countries.get(0));
    for (String country : countries) {
      System.out.println(country);
    }
    countries.remove(1);
    System.out.println(countries);
  }
}
