package com.wuxy.repository;

import com.wuxy.entity.Student;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-10 10:47
 **/
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(long id);
}
