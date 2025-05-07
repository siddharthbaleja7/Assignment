package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepo;

    public List<Teacher> getAllTeachers() { return teacherRepo.findAll(); }
    public Teacher saveTeacher(Teacher teacher) { return teacherRepo.save(teacher); }
    public Teacher getTeacher(Long id) { return teacherRepo.findById(id).orElse(null); }
}