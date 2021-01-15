package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCotroller { 

     @Autowired
     public StudentRepository studentRepository;


        @GetMapping("/home")
        public List<Student> home(){

           return studentRepository.findAll();

           }


          @PostMapping("/create")
          public String createStudent(@RequestBody Student student){

           Student insertedStudent = studentRepository.insert(student);

           return "student created"  + insertedStudent.getName();

          }
   }
