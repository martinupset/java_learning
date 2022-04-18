package com.example.demogs1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//use to created get method request api
@RestController
public class EmpController {
  @GetMapping("/hello")
  public String hw() {
    return "hello world";
  }
}
