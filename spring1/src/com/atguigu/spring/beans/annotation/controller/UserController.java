package com.atguigu.spring.beans.annotation.controller;

import com.atguigu.spring.beans.annotation.TestObject;
import com.atguigu.spring.beans.annotation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired(required=false)
    private TestObject testObject;

    public void execute() {
        System.out.println("UserController's execute...");
        userService.save();
        System.out.println(testObject);
    }

}
