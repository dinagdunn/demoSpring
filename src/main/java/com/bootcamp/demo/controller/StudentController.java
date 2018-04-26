package com.bootcamp.demo.controller;

//controller is lowercase

import com.bootcamp.demo.model.Student;
import com.bootcamp.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Spock and groovey dependencies are not automatically included with the spring initliazer so we need to add it manually in the pom file.

@RestController
public class StudentController {
    @Autowired
    StudentService studentService; //we can just intiatiate our student service like this with the @Autowired becuase we arleady set it as a @Component

    @GetMapping("/students") //you can also use @RequestMapping, but the @GetMapping annotation is more explicit about what you are wanting to do
    public List<Student> getStudents() { //you can name this method name whatever you want.. but this return type is mirroring what our service logic is returning;
        return studentService.getStudentList();
    }

}
