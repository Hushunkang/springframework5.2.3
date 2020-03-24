package com.atguigu.spring.beans.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 09时28分43秒
 */
public class LifeCycleTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);



        //关闭spring ioc容器
        ctx.close();
    }

}
