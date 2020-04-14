package com.atguigu.spring.beans.collections;

import com.atguigu.spring.beans.Car;

import java.util.Map;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日
 */
public class NewPersonOfRich {

    private String name;
    private int age;
    private Map<Integer,Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(Map<Integer,Car> cars) {
        this.cars = cars;
    }

    public NewPersonOfRich() {
    }

    public NewPersonOfRich(String name, int age, Map<Integer,Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

}
