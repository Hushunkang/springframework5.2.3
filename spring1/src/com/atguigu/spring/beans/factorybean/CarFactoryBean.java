package com.atguigu.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 10时35分55秒
 */
public class CarFactoryBean implements FactoryBean {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //返回bean的对象实例
    @Override
    public Object getObject() throws Exception {
        return new Car(brand, 200000);
    }

    //返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
