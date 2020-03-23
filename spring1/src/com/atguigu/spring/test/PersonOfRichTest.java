package com.atguigu.spring.test;

import com.atguigu.spring.beans.collections.PersonOfRich;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日 15时00分58秒
 */
public class PersonOfRichTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonOfRich person5 = (PersonOfRich) ctx.getBean("person5");
        System.out.println(person5);
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonOfRich person7 = (PersonOfRich) ctx.getBean("person7");
        System.out.println(person7);
    }

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonOfRich person8 = (PersonOfRich) ctx.getBean("person8");
        System.out.println(person8);
    }

}