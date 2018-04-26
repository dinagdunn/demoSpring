package com.bootcamp.demo.service;

import com.bootcamp.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // this means that it is available as a bean so it gets autowired into our controller instead of having to instantiate it
public class StudentService {
//we create our list of students here

    private List<Student> studentList = new ArrayList<>(); //giving this list a type of Student model. List is the interface for an array  list. Doing the instantiation this way with a List<> vs an ArrayList<>.. you get access to everything in the List method since it is an interface as opposed to just having access to ONLY the ArrayList<> methods.

    public StudentService() {
        Student student1 = new Student();
        //two ways to set this student.. one is without the constructor and one will be with the constructor

        //without the constructor
        student1.setName("Shahar");
        student1.setAge(24);

        //with the constructor
        Student student2 = new Student("Victor", 25);
        Student student3 = new Student("Noelle", 24);
        Student student4 = new Student("Mariano", 25);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }


    public List<Student> getStudentList() { //need a way to return the studentList that we just created above with a getter. We are returning a List<> with the type "Student"
        return studentList;
    }

}
