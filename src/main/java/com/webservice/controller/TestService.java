package com.webservice.controller;

import com.webservice.Service.UserService;
import com.webservice.domain.Student;
import com.webservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebParam;

/**
 * @Copyright: Copyright (c) 2019
 * @Company: www.baosight.com
 * @program: Axis_service
 * @FileName: test
 * @description: axis2发布的webservice服务端
 * @author: binzhang
 * @create: 2019/05/07 15:22
 * @version:
 */

public class TestService{

   // @Autowired
    //private UserService userService;

    UserService userService=new UserService();


    public String test(User user){


        Boolean flag = userService.getUser(user);
        if (!flag){
            return "用户接口调用失败";
        }
        return "用户接口调用成功";
    }

    public  String test2(Student student){

        return "学号"+student.getId()+"学生,欢迎你的归来!";
    }

    public String test3(String name) {
        try {
            System.out.println(name);


            Boolean flag = userService.getAuth(name);
            if (!flag) {
                return "用户非授权用户,请停止调用";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return "用户登录成功,请尽情享用";
    }
}
