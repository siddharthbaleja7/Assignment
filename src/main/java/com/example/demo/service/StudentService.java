package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents() { return studentRepo.findAll(); }
    public Student saveStudent(Student student) { return studentRepo.save(student); }
    public Student getStudent(Long id) { return studentRepo.findById(id).orElse(null); }
}