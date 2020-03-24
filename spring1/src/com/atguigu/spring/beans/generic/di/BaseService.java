package com.atguigu.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 12时21分55秒
 */
public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> repository;//Could not autowire. No beans of 'BaseRepository<T>' type found.
    //说明：idea报错，但是实际上并没有错，“人工智能”有时候也是“人工智障”，最核心的还是要锻炼出一个自个的强大的大脑来分析判断事物

    public void save(){
        System.out.println("BaseService's save...");
        System.out.println(repository);
    }

}
