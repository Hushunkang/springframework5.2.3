package com.atguigu.config;

import com.atguigu.beans.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月26日
 */
@Configuration
//@ComponentScan(value="com.atguigu",includeFilters={
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class, Service.class})
//},useDefaultFilters=false)
//@ComponentScan(value="com.atguigu",excludeFilters={
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class,Service.class,Configuration.class,Bean.class})
//})
//@ComponentScan这个注解表示只要是标注了@Component、@Controller、@Service、@Repository的Bean都会被注册到spring ioc容器里面，但是它对@Configuration、@Bean不起作用
@ComponentScan(value="com.atguigu")
public class MainConfig {

    @Bean("book2")
    public Book book(){
        return new Book(1,"辟邪剑谱",1);
    }

}
