package com.example.Mapping1.controller;

import com.example.Mapping1.model.Student;
import com.example.Mapping1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;
        @PostMapping("/add-student")
        public void addStudent(@RequestBody Student student){
            studentService.addStudent(student);
        }
        @GetMapping("get-student/studentId/{studentId}")
        public Student getStudentById(@PathVariable Integer studentId){
            return studentService.getStudentById(studentId);
        }
        @GetMapping("/get-all-student")
        public List<Student> getAllStudent(){
            return studentService.getAllStudent();
        }
        @PutMapping("/update-student/studentId/{studentId}")
        public Student updateStudent(@PathVariable Integer studentId,@RequestBody Student student){
            return studentService.updateStudent(studentId,student);
        }
        @DeleteMapping("/delete-student/studentId/{studentId}")
        public void deleteStudent(@PathVariable Integer studentId){
            studentService.deleteStudent(studentId);
        }
}
