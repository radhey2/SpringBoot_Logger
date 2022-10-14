package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.TestDTO;
import com.example.demo.modal.Test;


@Service
public class TestService implements ITestService {


    private  List<Test> list = new ArrayList<>();

  {
    list.add(new Test("Radhey", "Email", "avxjncd"));
    list.add(new Test("Ram", "Email", "avxjncd"));
}
  
  public List<Test> getTest(){
    return list;
  }

  public Test addData(TestDTO testDTO) {
    Test test = new Test(testDTO);
    list.add(test);
    return test;
  }


 
    }
