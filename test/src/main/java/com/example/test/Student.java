package com.example.test;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student { 
  
    private long id;
    private String name;
    private double age;
    private int grade;


    public Student() {
        super();
    }


    public Student(long id, String name, double age, int grade) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
