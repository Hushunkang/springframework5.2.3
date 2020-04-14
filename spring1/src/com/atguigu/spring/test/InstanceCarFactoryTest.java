package com.atguigu.spring.test;

import com.atguigu.spring.beans.factory.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class InstanceCarFactoryTest {

    @Test
    public void getCar() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);
    }

}