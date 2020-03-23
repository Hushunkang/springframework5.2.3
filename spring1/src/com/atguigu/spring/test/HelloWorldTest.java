package com.atguigu.spring.test;

import com.atguigu.spring.beans.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日 12时24分03秒
 */
public class HelloWorldTest {

    @Test
    public void hello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Spring Framework");
        helloWorld.hello();
    }

    @Test
    public void test1(){
        //1.创建spring ioc容器的对象实例，泛泛的理解，一个spring的配置文件可以对应一个spring ioc容器的对象实例
        //说明1：ClassPathXmlApplicationContext是ApplicationContext接口的实现类，该类从类路径下加载spring的配置文件
        //说明2：工程/模块的classpath（类路径
        //说明3：FileSystemXmlApplicationContext是ApplicationContext接口的实现类，该类从文件系统中加载spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //2.在ioc容器中获取bean的对象实例，利用id来定位spring ioc容器的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //利用类型定位spring ioc容器的bean，但要求spring ioc容器中该类型的bean只有一个
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        //3.调用hello方法
        helloWorld.hello();
    }

}