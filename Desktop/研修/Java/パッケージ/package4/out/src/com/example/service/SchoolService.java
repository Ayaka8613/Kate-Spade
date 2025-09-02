package com.example.service;

import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;

public class SchoolService {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student){
        if (student.getAge() >= 10){
            students.add (student);
        }else{
            System.out.println(student.getName() + "さんは10歳以下です");
        }
    }
    public void addTeacher (Teacher teacher){
        if (teacher.getAge() >= 10){
            teachers.add(teacher);
        }else{
            System.out.println(teacher.getName() + "さんは10歳以下です");
        }
    }
    
    public void printAllStudents(){
        for (Student student : students){
            System.out.println(String.format( "%s, %d, %s,生徒",student.getName() ,student.getAge() , student.getClassRoom()));
        }
    }
    public void printAllTeachers(){
        for (Teacher teacher : teachers){
            System.out.println(String.format("%s ,%d , %s,教師",teacher.getName() ,teacher.getAge() , teacher.getSubject()));
        }
    }
}
