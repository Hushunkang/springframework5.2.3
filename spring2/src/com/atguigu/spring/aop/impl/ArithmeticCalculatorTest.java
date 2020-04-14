package com.atguigu.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class ArithmeticCalculatorTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        IArithmeticCalculator arithmeticCalculator = ctx.getBean(IArithmeticCalculator.class);
//        ArithmeticCalculatorImpl arithmeticCalculator = ctx.getBean(ArithmeticCalculatorImpl.class);//No qualifying bean of type 'com.atguigu.spring.aop.impl.ArithmeticCalculatorImpl' available
        IArithmeticCalculator arithmeticCalculator = (IArithmeticCalculator) ctx.getBean("arithmeticCalculator");
        System.out.println(ctx.getBean(IArithmeticCalculator.class).getClass());//class com.sun.proxy.$Proxy19
//        System.out.println(ctx.getBean(ArithmeticCalculatorImpl.class).getClass());//No qualifying bean of type 'com.atguigu.spring.aop.impl.ArithmeticCalculatorImpl' available
        System.out.println(ctx.getBean("arithmeticCalculator").getClass());//class com.sun.proxy.$Proxy19
        int result = arithmeticCalculator.add(1,2);
        System.out.println("result:" + result);

//        result = arithmeticCalculator.div(10,2);
        result = arithmeticCalculator.div(10,0);
        System.out.println("result:" + result);
    }

}
