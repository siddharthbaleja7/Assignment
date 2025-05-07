package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    @ResponseBody
    public List<Teacher> listTeachers() { return teacherService.getAllTeachers(); }

    @GetMapping("/teachers/{id}")
    @ResponseBody
    public Teacher getTeacher(@PathVariable Long id) { return teacherService.getTeacher(id); }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @PostMapping("/teachers/update")
    public String updateTeacher(@ModelAttribute Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }
}