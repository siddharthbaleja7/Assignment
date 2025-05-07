package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getCoursesByStudent(Long studentId) { return courseRepo.findByStudentId(studentId); }
    public Course saveCourse(Course course) { return courseRepo.save(course); }
    public Course getCourse(Long id) { return courseRepo.findById(id).orElse(null); }
}