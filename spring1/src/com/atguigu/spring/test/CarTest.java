package com.atguigu.spring.test;

import com.atguigu.spring.beans.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日
 */
public class CarTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) ctx.getBean("car3");
        System.out.println(car3);

        Car car4 = (Car) ctx.getBean("car4");
        System.out.println(car4);
    }

}