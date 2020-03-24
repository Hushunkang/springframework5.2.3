package com.atguigu.spring.beans.annotation;

import com.atguigu.spring.beans.annotation.controller.UserController;
import com.atguigu.spring.beans.annotation.repository.UserRepositoryImpl;
import com.atguigu.spring.beans.annotation.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 11时14分29秒
 */
public class AnnotationTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
        TestObject testObject = (TestObject) ctx.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);

        UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
        System.out.println(userService);

        UserRepositoryImpl userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");
        System.out.println(userRepository);
    }

}
