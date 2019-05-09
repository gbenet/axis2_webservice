package com.webservice.domain;

/**
 * @Copyright: Copyright (c) 2019
 * @Company: www.baosight.com
 * @program: Axis_service
 * @FileName: Student
 * @description: 学生类
 * @author: binzhang
 * @create: 2019/05/08 10:44
 * @version:
 */
public class Student{

    public String id;

    public Student(String id) {
        this.id = id;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
