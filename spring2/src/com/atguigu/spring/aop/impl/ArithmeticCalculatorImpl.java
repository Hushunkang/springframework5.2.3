package com.atguigu.spring.aop.impl;

import org.springframework.stereotype.Component;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 13时19分34秒
 */
@Component
public class ArithmeticCalculatorImpl implements IArithmeticCalculator {

    @Override
    public int add(int i, int j) {
        int result = i + j;
//        System.out.println("result:" + result);
        return result;
    }

    @Override
    public int minus(int i, int j) {
        int result = i - j;
//        System.out.println("result:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
//        System.out.println("result:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
//        System.out.println("result:" + result);
        return result;
    }

}
