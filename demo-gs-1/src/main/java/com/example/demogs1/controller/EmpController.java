package com.example.demogs1.controller;

import com.example.demogs1.model.Emp;
import com.example.demogs1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//use to created get method request api
@RestController
public class EmpController {
  //DI => create an obj and Injected => default: singleton
  @Autowired
  EmpService empService;

  @GetMapping("/hello")
  public String hw() {
    return "hello world";
  }

  @GetMapping("/emps")
  public List<Emp> getAll () {
    return empService.getEmpList();
  }

  @PostMapping("/emp")
  public Boolean add (@RequestBody Emp emp) {
    System.out.println(emp);
    return empService.add(emp);
  }
}
