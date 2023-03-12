package com.example.Mapping1.controller;

import com.example.Mapping1.model.Course;
import com.example.Mapping1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/add-course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
    @PostMapping("/course-student")
    public void studentandcourse(@RequestParam Integer courseId,@RequestParam Integer studentId){
        courseService.connectStudentCourse(courseId,studentId);
    }


    @GetMapping("course/courseId/{courseId}")
    public Course getCoursesById(@PathVariable Integer courseId){
        return courseService.getCourseById(courseId);
    }
    @GetMapping("/get-all-course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @PutMapping("/update-course/courseId/{courseId}")
    public Course updateCourse(@PathVariable Integer courseId,@RequestBody Course course){
        return courseService.updateCourse(courseId,course);
    }
    @DeleteMapping("/delete-course/courseId/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
    }
}
