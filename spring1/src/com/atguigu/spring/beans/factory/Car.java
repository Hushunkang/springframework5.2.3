package com.atguigu.spring.beans.factory;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class Car {

    private String brand;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car() {
        System.out.println("Car's constructor...");
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

}
