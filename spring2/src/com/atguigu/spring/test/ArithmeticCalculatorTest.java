package com.atguigu.spring.test;

import com.atguigu.spring.aop.ArithmeticCalculatorImpl;
import com.atguigu.spring.aop.ArithmeticCalculatorLogImpl;
import com.atguigu.spring.aop.ArithmeticCalculatorLogProxy;
import com.atguigu.spring.aop.IArithmeticCalculator;
import org.junit.Test;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class ArithmeticCalculatorTest {

    @Test
    public void test1(){
        IArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorLogImpl();
        arithmeticCalculator.add(1,2);
        arithmeticCalculator.minus(1,2);
        arithmeticCalculator.mul(1,2);
        arithmeticCalculator.div(1,2);
    }

    @Test
    public void test2(){
        IArithmeticCalculator target = new ArithmeticCalculatorImpl();//最终需要使用被代理类对象进行赋值，即被代理的对象
        //动态代理返回一个代理类的对象proxy，在动态代理的整个过程中，是看不到代理类的，因为动态代理是在程序运行的过程中动态生成的
        IArithmeticCalculator proxy = new ArithmeticCalculatorLogProxy(target).getLogProxy();
//        System.out.println(proxy.getClass());//class com.sun.proxy.$Proxy4
        //说明：jdk自带动态代理，需要用到反射知识
        //当通过代理类对象调用方法时，会自动调用被代理类中同名方法
        int addResult = proxy.add(1, 2);
//        System.out.println("addResult:" + addResult);
        int minusResult = proxy.minus(1,2);
//        System.out.println("minusResult:" + minusResult);
    }

}