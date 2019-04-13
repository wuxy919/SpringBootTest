package com.wuxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: wuxy
 * @create: 2019-04-10 10:44
 **/
@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
