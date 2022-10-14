package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.demo.DTO.ResponseDTO;
import com.example.demo.DTO.TestDTO;
import com.example.demo.Service.TestService;
import com.example.demo.modal.*;

@RestController
@RequestMapping("Test")
public class TestController {

  @Autowired
  private TestService testService;

  // @Autowired
  // @Qualifier(value= "abc")
  // private Test t;
  @GetMapping("/get")

  public ResponseEntity<ResponseDTO> getTest(
      @RequestHeader(value = "Authorization") String Authorization) {
    System.out.println(Authorization);
    ResponseDTO responseDTO = null;
    if (Authorization.equals("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")) {

      List<Test> list = testService.getTest();
      responseDTO = new ResponseDTO("Get Call For Success", list);

    } else {
      System.out.println("Bad Request");
    }
    return new ResponseEntity<>(responseDTO, HttpStatus.OK);
  }

  @PostMapping("/getUserDetail")
  public ResponseEntity<ResponseDTO> addData(@RequestBody TestDTO testDTO) {
    Test test = testService.addData(testDTO);
    ResponseDTO responseDTO = new ResponseDTO("Post Call Success", test);
    return new ResponseEntity<>(responseDTO, HttpStatus.OK);
  }
}
