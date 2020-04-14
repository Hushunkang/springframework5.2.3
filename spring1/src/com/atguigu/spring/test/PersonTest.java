package com.atguigu.spring.test;

import com.atguigu.spring.beans.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日
 */
public class PersonTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);

        Person person3 = (Person) ctx.getBean("person3");
        System.out.println(person3);

        Person person4 = (Person) ctx.getBean("person4");
        System.out.println(person4);
    }

}