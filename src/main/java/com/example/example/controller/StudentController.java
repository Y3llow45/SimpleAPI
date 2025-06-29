package com.example.example.controller;

import com.example.example.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(1, "John Doe", 20);
        //return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "John Rich", 27));
        students.add(new Student(3, "Jane Smith", 22));
        return students;
    }

    @GetMapping("/student/{id}")
    public Student studentPathVariable(@PathVariable int id) {
        return new Student(id, "Someone", 0);
    }

    @PostMapping("/student/create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        //return "Student created: " + student.getName();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student created: " + student.getName());
    }
}
