package com.atguigu.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class AchieveAopByXmlTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-xml.xml");
        IArithmeticCalculator arithmeticCalculator1 = ctx.getBean(IArithmeticCalculator.class);
        System.out.println(arithmeticCalculator1);
        int result = arithmeticCalculator1.add(1,2);
        System.out.println("result:" + result);

        result = arithmeticCalculator1.div(10,0);
        System.out.println("result:" + result);
    }

}
