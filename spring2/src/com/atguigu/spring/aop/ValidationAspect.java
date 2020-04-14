package com.atguigu.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
@Component
@Aspect
//使用@Order注解来设置切面类的优先级，value属性值越小，优先级越高
@Order(1)
public class ValidationAspect {

//    @Before("execution(public int com.atguigu.spring.aop.impl.IArithmeticCalculator.*(..))")
    @Before("com.atguigu.spring.aop.impl.LogAspect.declareJoinPointExpression()")
    public void validateArgs(JoinPoint joinpoint){
        System.out.println("Validate:" + Arrays.asList(joinpoint.getArgs()));
    }

}
