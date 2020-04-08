package com.atguigu.config;

import com.atguigu.beans.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月26日 14时04分56秒
 */
@Configuration
//@ComponentScan(value="com.atguigu",includeFilters={
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class, Service.class})
//},useDefaultFilters=false)
//@ComponentScan(value="com.atguigu",excludeFilters={
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class,Service.class,Configuration.class,Bean.class})
//})
//@ComponentScan这个注解的作用是将标识有@Component注解功能的注解（@Configuration、@Component、@Controller、@Service、@Repository）所标识的Bean注册到spring ioc容器里面
@ComponentScan(value="com.atguigu")
public class MainConfig {

    @Bean("book2")
    public Book book(){
        return new Book(1,"辟邪剑谱",1);
    }

}
