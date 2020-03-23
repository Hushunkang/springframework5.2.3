package com.atguigu.spring.beans;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月23日 11时51分08秒
 */
public class HelloWorld {

    private String name;

    public void setName(String name) {
        System.out.println("HelloWorld's setName...");
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello:" + name + ".");
    }

    public HelloWorld() {
        System.out.println("HelloWorld's constructor...");
    }

}
