package com.atguigu.spring.aop.xml;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
public class ValidationAspect {

    public void validateArgs(JoinPoint joinpoint){
        System.out.println("Validate:" + Arrays.asList(joinpoint.getArgs()));
    }

}
