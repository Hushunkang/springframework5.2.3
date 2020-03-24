package com.atguigu.spring.aop;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 13时00分53秒
 */
public class ArithmeticCalculatorLogImpl implements IArithmeticCalculator {

    @Override
    public int add(int i, int j) {
        System.out.println("The method add begins with:[" + i + "," + j + "]");
        int result = i + j;
        System.out.println("The method add ends with:" + result);
        return result;
    }

    @Override
    public int minus(int i, int j) {
        System.out.println("The method minus begins with:[" + i + "," + j + "]");
        int result = i - j;
        System.out.println("The method minus ends with:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("The method mul begins with:[" + i + "," + j + "]");
        int result = i * j;
        System.out.println("The method mul ends with:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("The method div begins with:[" + i + "," + j + "]");
        int result = i / j;
        System.out.println("The method div ends with:" + result);
        return result;
    }
    //思考：这样的日志处理是不是可以抽取出来，统一的动态注入日志相关的代码？
    //回答：可以的，使用AOP的编程思想，运用代理模式（23种设计模式之一），尤其指动态代理（需要用到反射知识）

}
