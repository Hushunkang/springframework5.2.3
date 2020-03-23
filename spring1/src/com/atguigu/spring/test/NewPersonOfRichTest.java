package com.atguigu.spring.test;

import com.atguigu.spring.beans.Car;
import com.atguigu.spring.beans.collections.NewPersonOfRich;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日 15时08分43秒
 */
public class NewPersonOfRichTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        NewPersonOfRich person6 = (NewPersonOfRich) ctx.getBean("person6");
        System.out.println(person6);
    }

    @Test
    public void test2(){
        Map<String, Car> cars = new HashMap<>();
        cars.put("1",new Car("BM1","SH"));
        cars.put("2",new Car("BM2","SH"));
        cars.put("3",new Car("BM3","SH"));
        System.out.println(cars);
    }

}