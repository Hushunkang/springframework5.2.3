package com.atguigu.spring.test;

import com.atguigu.spring.beans.factorybean.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class CarFactoryBeanTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }

}