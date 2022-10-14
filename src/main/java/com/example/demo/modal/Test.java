package com.example.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.demo.DTO.TestDTO;

import lombok.Data;


@Entity

@XmlRootElement
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private String name;
    private String email;
    private String password;

 

   public Test(String name, String email, String password){
      this.name = name;
      this.email = email;
      this.password = password;
   }

   public Test(TestDTO testDTO){
      this.name = testDTO.name;
      this.email =testDTO.email;
       this.password = testDTO.password;
   }

}