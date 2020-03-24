package com.atguigu.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *
 * 使用动态代理来实现AOP（面向切面编程）
 *
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 13时20分55秒
 */
public class ArithmeticCalculatorLogProxy {

    private IArithmeticCalculator target;//最终需要使用被代理类对象进行赋值，即被代理的对象

    public ArithmeticCalculatorLogProxy(IArithmeticCalculator target) {
        this.target = target;
    }

    public IArithmeticCalculator getLogProxy() {
        IArithmeticCalculator proxy;

        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            /**
             * @param proxy  正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象
             * @param method 即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
             * @param args   调用方法时传入的实参
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //被代理类的方法执行之前，向被代理类的方法中动态注入日志代码
                System.out.println("The method " + methodName + " begins with:" + Arrays.asList(args));
                Object result = null;

                try {
                    //前置通知
                    result = method.invoke(target, args);
                    //返回通知，返回通知方法是可以访问到目标方法的返回值
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                    //异常通知，异常通知方法是可以访问到目标方法的异常
                }
                //后置通知，因为目标方法可能会出现异常，因此后置通知方法是不可以访问到目标方法的返回值

                //被代理类的方法执行之后，向被代理类的方法中动态注入日志代码
                System.out.println("The method minus ends with:" + result);
                return result;
            }
        };

        proxy = (IArithmeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }

}
