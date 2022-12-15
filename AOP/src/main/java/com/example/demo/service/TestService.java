package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.RequestDTO;
import com.example.demo.modal.Test;

@Service
public class TestService {
	private List<Test> list = new ArrayList<>();

	  {
	    list.add(new Test("Radhey", "Email", "avxjncd"));
	    list.add(new Test("Ram", "Email", "avxjncd"));
	    list.add(new Test("Shyam", "Email", "avxjncd"));
	  }

	  public List<Test> getTest() {
	    return list;
	  }

	  public Test addData(RequestDTO testDTO) {
	    Test test = new Test(testDTO);
	    list.add(test);
	    return test;
	  }
}
