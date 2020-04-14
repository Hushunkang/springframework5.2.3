package com.atguigu.spring.beans.collections;

import com.atguigu.spring.beans.Car;

import java.util.List;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日
 */
public class PersonOfRich {

    private String name;
    private int age;
    private List<Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public PersonOfRich() {
    }

    public PersonOfRich(String name, int age, List<Car> cars) {
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
