package com.sc.training.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEg {
  public static void main(String[] args) {
    //set => interface hashset=> implements class
    Set<String> countries = new HashSet<String>();
    countries.add("UK");
    countries.add("UK");
    countries.add("US");
    System.out.println(countries);
  }
}
