package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 使用静态工厂方法来配置bean：直接调用某一个类的静态方法就可以返回该bean的对象实例
 *
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class StaticCarFactory {

    private static Map<String,Car> cars = new HashMap<>();

    static{
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    /**
     * 静态工厂方法
     * @param brand
     * @return
     */
    public static Car getCar(String brand){
        return cars.get(brand);
    }

}
