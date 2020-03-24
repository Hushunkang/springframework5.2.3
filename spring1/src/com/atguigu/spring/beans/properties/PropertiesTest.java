package com.atguigu.spring.beans.properties;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 08时12分48秒
 */
public class PropertiesTest {

    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
        //获取数据源，即一个数据库连接池对象
        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
        //从数据库连接池对象中获取数据库的连接对象/连接会话，前提是数据库服务端要存在并且开启着的，否则会有连接异常
        System.out.println(dataSource.getConnection());
        //spring配置文件读取资源文件username出现的问题:https://blog.csdn.net/q1054261752/article/details/52032699
    }

}
