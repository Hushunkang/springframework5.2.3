package com.atguigu.spring.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 04时25分04秒
 */
public class JdbcTest {

    private ApplicationContext ctx;
    private JdbcTemplate jdbcTemplate;

    {
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    @Test
    public void testDataSource() throws SQLException {
        //获取数据源，即一个数据库连接池对象
        DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
        //从数据库连接池对象中获取数据库的连接对象/连接会话，前提是数据库服务端要存在并且开启着的，否则会有连接异常
        System.out.println(dataSource.getConnection());
    }

    //执行单行更新：增加、删除、修改
    @Test
    public void testUpdate(){
        String sql = "update departments set manager_id=? where department_id=?";
        jdbcTemplate.update(sql,115,30);
    }

    //执行批量更新：批量的增加、删除、修改
    @Test
    public void testBatchUpdate(){
        //...spring JdbcTemplate的例子具体可看看ppt课件
    }

}
