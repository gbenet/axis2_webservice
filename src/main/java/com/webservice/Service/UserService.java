package com.webservice.Service;

import com.webservice.domain.User;
import org.springframework.stereotype.Service;


/**
 * @Copyright: Copyright (c) 2019
 * @Company: www.baosight.com
 * @program: Axis_service
 * @FileName: UserService
 * @description: 用户服务类
 * @author: binzhang
 * @create: 2019/05/08 09:54
 * @version:
 */
public class UserService{

    public Boolean getUser(User user) {
        String userName = user.getName();
        if("章斌".equals(userName)){
            return true;
        }
        return false;
    }

    public Boolean getAuth(String name){
        if("章斌".equals(name)){
            return true;
        }
        return false;
    }
}
