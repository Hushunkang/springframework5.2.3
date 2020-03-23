package com.atguigu.spring.beans.scope;

import com.atguigu.spring.beans.autowire.Car;
import com.atguigu.spring.beans.relation.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 06时52分06秒
 */
public class ScopeTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car1 = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");

        System.out.println(car1 == car2);//spring ioc容器中bean的配置默认是单例的，即singleton

        Car car3 = (Car) ctx.getBean("car2");
        Car car4 = (Car) ctx.getBean("car2");
        System.out.println(car3 == car4);
    }

}
