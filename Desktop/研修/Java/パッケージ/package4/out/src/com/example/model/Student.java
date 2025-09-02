package com.example.model;

public class Student extends Person{
   private String classRoom;
   private int grade;

   public Student(String name , int age , String classRoom , int grade){
     super(name, age);
     this.classRoom = classRoom;
     this.grade = grade;
   }
   public String getClassRoom(){
    return classRoom;
   }
   public int getGrade(){
    return grade;
   }
}