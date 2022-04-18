package com.sc.training.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
  public static void main(String[] args) {
    //key cannot be duplicated, value can duplicated
    Map<String,String> countries = new HashMap<>();
    countries.put("US", "dollar");
    countries.put("UK", "pods");
//  replace: countries.put("US", "aa");
    System.out.println(countries);
    System.out.println(countries.get("US"));
    System.out.println(countries.get("NZ"));
    for (Map.Entry<String,String> entry : countries.entrySet()) {
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
    countries.remove("US");
    System.out.println(countries);
  }
}