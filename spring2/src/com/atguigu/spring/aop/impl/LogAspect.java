package com.atguigu.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
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
@Order(2)
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
    @After("execution(* com.atguigu.spring.aop.impl.*.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " ends");
    }

    //声明该方法是一个返回通知方法，在目标方法正常结束后（目标方法不能发生异常，否则不会有返回通知），执行的通知，因此返回通知方法是可以访问到目标方法的返回值
    @AfterReturning(value="execution(* com.atguigu.spring.aop.impl.*.*(..))",returning="result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " ends with " + result);
    }

    //声明该方法是一个异常通知方法，在目标方法出现异常的时候执行，异常通知方法是可以访问到目标方法的异常
    //也可以指定目标方法出现特定异常的时候执行异常通知方法
    @AfterThrowing(value="execution(* com.atguigu.spring.aop.impl.*.*(..))",throwing="ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " occurs exception " + ex);
    }

    //声明该方法是一个环绕通知方法，环绕通知方法需要携带ProceedingJoinPoint类型的参数
    //环绕通知方法类似于动态代理的全过程，ProceedingJoinPoint类型的参数可以决定是否执行目标方法
    //环绕通知方法必须有返回值，返回值即为目标方法的返回值
    @Around(value="execution(* com.atguigu.spring.aop.impl.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjd){
        Object result = null;
        String methodName = pjd.getSignature().getName();
        List<Object> args = Arrays.asList(pjd.getArgs());
        //执行目标方法
        try {
            //前置通知
            System.out.println("The method " + methodName + " begins with " + args);
            result = pjd.proceed();
            //返回通知
            System.out.println("The method " + methodName + " ends with " + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //异常通知
            System.out.println("The method " + methodName + " occurs exception " + throwable);
            throw new RuntimeException(throwable);
        }
        //后置通知
        System.out.println("The method " + methodName + " ends");
        return  result;
    }

}
