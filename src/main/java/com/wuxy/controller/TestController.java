package com.wuxy.controller;

import com.wuxy.entity.Student;
import com.wuxy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-10 13:18
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", studentService.findAll());
        return modelAndView;
    }

    @GetMapping("/findById")
    public ModelAndView findById(long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student", studentService.findById(id));
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Student student) {
        studentService.update(student);
        return "redirect:/test/findAll";
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentService.save(student);
        return "redirect:/test/findAll";
    }

    @GetMapping("/deleteById")
    public String deleteById(long id) {
        studentService.deleteById(id);
        return "redirect:/test/findAll";
    }

    @RequestMapping("/test")
    public String test() {
        return "index";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        Student student = new Student(1L,"张三",22);
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"张三",22));
        list.add(new Student(2L,"李四",23));
        list.add(new Student(3L,"王五",24));
        modelAndView.setViewName("index");
        modelAndView.addObject("student", student);
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
