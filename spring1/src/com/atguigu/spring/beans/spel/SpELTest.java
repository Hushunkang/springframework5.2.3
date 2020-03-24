package com.atguigu.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 09时00分27秒
 */
public class SpELTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-spel.xml");
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

}
