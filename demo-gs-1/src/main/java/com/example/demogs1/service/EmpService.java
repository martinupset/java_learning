package com.example.demogs1.service;

import com.example.demogs1.model.Emp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//whenever we put service on top of class spring creates objects
@Service
public class EmpService {
  List<Emp> emps = new ArrayList<Emp>();

  public List<Emp> getEmpList() {
    return emps;
  }

  public Boolean add(Emp emp) {
    emps.add(emp);
    return true;
  }
}
