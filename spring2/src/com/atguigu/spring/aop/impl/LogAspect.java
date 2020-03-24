package com.atguigu.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 16时10分12秒
 */
//把当前类声明成为一个切面
    //1.需要把当前类放到spring ioc容器中
    //2.然后再把当前类声明成一个切面
@Component
@Aspect
public class LogAspect {

    //声明该方法是一个前置通知方法，在执行目标方法之前，执行的通知
//    @Before("execution(public int com.atguigu.spring.aop.impl.IArithmeticCalculator.add(int,int))")
//    @Before("execution(public int com.atguigu.spring.aop.impl.IArithmeticCalculator.*(int,int))")
    @Before("execution(* com.atguigu.spring.aop.impl.IArithmeticCalculator.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " begins with " + args);
    }

    //声明该方法是一个后置通知方法，在执行目标方法之后（无论目标方法是否发生异常），执行的通知
    @After("execution(* com.atguigu.spring.aop.impl.*.*(int,int))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " ends");
    }

}
