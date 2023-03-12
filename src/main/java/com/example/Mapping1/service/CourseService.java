package com.example.Mapping1.service;

import com.example.Mapping1.dao.ICourse;
import com.example.Mapping1.dao.IStudent;
import com.example.Mapping1.model.Course;
import com.example.Mapping1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourse iCourse;
    @Autowired
    private IStudent iStudent;
    public void addCourse(Course course) {
        iCourse.save(course);
    }

    public Course getCourseById(Integer courseId) {
        return iCourse.findById(courseId).get();
    }

    public List<Course> getAllCourses() {
        return iCourse.findAll();
    }

    public Course updateCourse(Integer courseId, Course course) {
        Course course1=iCourse.findById(courseId).get();
        course1.setCourseDuration(course.getCourseDuration());
        course1.setCourseTitle(course.getCourseTitle());
        course1.setStudentList(course.getStudentList());
        course1.setCourseDescription(course.getCourseDescription());
        return iCourse.save(course1);
    }

    public void deleteCourse(Integer courseId) {
        iCourse.deleteById(courseId);
    }

    public Course connectStudentCourse(Integer courseId, Integer studentId) {
        List<Student> list=new ArrayList();
        Course course = iCourse.findById(courseId).get();
        Student student = iStudent.findById(studentId).get();
        list.add(student);
        course.setStudentList(list);
        Course save = iCourse.save(course);
        return save;
    }
}
