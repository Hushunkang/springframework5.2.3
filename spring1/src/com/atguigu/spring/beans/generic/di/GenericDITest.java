package com.atguigu.spring.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 12时31分03秒
 */
public class GenericDITest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }

}
