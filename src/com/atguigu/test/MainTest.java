package com.atguigu.test;

import com.atguigu.beans.Book;
import com.atguigu.beans.Person;
import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月26日
 */
public class MainTest {

    @Test
    public void test1(){
        //获取AnnotationConfigApplicationContext这种类型的spring ioc容器类的对象实例
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("Bean的定义统计：" + applicationContext.getBeanDefinitionCount());



        //细节：通过注解的方式在spring ioc容器里面注册Bean，如果同类型的两个Bean的名称是一样的（即id一样），那么最终只会有一个Bean被注册了
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : definitionNames) {
//            Class<?> beanType = applicationContext.getType(beanName);
//            System.out.println("BeanName:" + beanName);
//            System.out.println("Bean的类型：" + beanType);
//            System.out.println("Bean所在的包：" + beanType.getPackage());
            System.out.println("Bean名称/Bean id：" + beanName);
        }



        System.out.println(applicationContext.getBean("book2"));
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        Book book = applicationContext.getBean(Book.class);
        System.out.println(person);
        System.out.println(book);
        applicationContext.close();
    }

}
