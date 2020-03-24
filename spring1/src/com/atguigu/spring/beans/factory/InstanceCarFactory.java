package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 使用实例工厂方法来配置bean：需要事先创建工厂本身的对象实例，然后再调用实例工厂方法
 *
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 10时17分58秒
 */
public class InstanceCarFactory {

    private Map<String,Car> cars;

    public InstanceCarFactory() {
        cars = new HashMap<>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    /**
     * 实例工厂方法
     * @param brand
     * @return
     */
    public Car getCar(String brand){
        return cars.get(brand);
    }

}
