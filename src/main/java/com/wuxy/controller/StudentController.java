package com.wuxy.controller;

import com.wuxy.entity.Student;
import com.wuxy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-10 11:07
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }

    @PostMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}
