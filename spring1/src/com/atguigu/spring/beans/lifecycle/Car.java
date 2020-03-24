package com.atguigu.spring.beans.lifecycle;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 09时22分50秒
 */
public class Car {

    public Car() {
        System.out.println("Car's constructor...");
    }

    private String brand;

    public void setBrand(String brand) {
        System.out.println("Car's setBrand...");
        this.brand = brand;
    }

    public void init2(){
        System.out.println("Car's init2...");
    }

    public void destory2(){
        System.out.println("Car's destory2...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

}
