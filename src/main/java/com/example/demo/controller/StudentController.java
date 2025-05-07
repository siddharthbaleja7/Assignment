package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    @ResponseBody
    public List<Student> listStudents() { return studentService.getAllStudents(); }

    @GetMapping("/students/{id}")
    @ResponseBody
    public Student getStudent(@PathVariable Long id) { return studentService.getStudent(id); }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}