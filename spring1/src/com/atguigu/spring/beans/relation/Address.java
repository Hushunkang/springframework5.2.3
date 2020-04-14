package com.atguigu.spring.beans.relation;

import com.atguigu.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class Address {

    private String city;
    private String street;

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

}

class AddressTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
        address = (Address) ctx.getBean("address2");
        System.out.println(address);
//        address = (Address) ctx.getBean("address3");//不能获取到抽象的bean
//        System.out.println(address);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

}