package com.atguigu.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 16时06分09秒
 */
public class ArithmeticCalculatorTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        ArithmeticCalculatorImpl arithmeticCalculator = ctx.getBean(ArithmeticCalculatorImpl.class);//No qualifying bean of type 'com.atguigu.spring.aop.impl.ArithmeticCalculatorImpl' available
        IArithmeticCalculator arithmeticCalculator = ctx.getBean(IArithmeticCalculator.class);
        int result = arithmeticCalculator.add(1,2);
        System.out.println("result:" + result);

        result = arithmeticCalculator.div(10,0);
        System.out.println("result:" + result);
    }

}
