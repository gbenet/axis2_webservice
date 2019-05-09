package com.webservice.domain;

/**
 * @Copyright: Copyright (c) 2019
 * @Company: www.baosight.com
 * @program: Axis_service
 * @FileName: User
 * @description: 用户实体类
 * @author: binzhang
 * @create: 2019/05/08 09:50
 * @version:
 */
public class User{

    public String name;
    public String sex;
    public int age;
    public String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public User(String name, String sex, int age, String level) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.level = level;
    }

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
