package com.wuxy.service;

import com.wuxy.entity.Student;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-10 11:02
 **/
public interface StudentService {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(long id);
}
