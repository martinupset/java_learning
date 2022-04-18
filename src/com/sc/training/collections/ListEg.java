package com.sc.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEg {
  public static void main(String[] args) {
    //list => interface; arraylist => implements
    List<String> countries = new ArrayList<String>();
    countries.add("UK");
    countries.add("US");
    System.out.println(countries);

  }
}
