package com.atguigu.config;

import com.atguigu.beans.Book;
import org.springframework.context.annotation.Bean;
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
//测试结论：@ComponentScan这个注解的作用目标只是@Component、@Controller、@Service、@Repository这四个注解
//@ComponentScan(value="com.atguigu")
public class MainConfig {

    @Bean
    public Book book(){
        return new Book(1,"辟邪剑谱",1);
    }

}
