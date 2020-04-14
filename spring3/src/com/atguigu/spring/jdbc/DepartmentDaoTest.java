package com.atguigu.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class DepartmentDaoTest {

    private ApplicationContext ctx;
    private JdbcTemplate jdbcTemplate;
    private DepartmentDao departmentDao;

    {
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        departmentDao = (DepartmentDao) ctx.getBean("departmentDao");
    }

    @Test
    public void getEmployeeById() {
        Department department = departmentDao.getEmployeeById(10);
        System.out.println(department);
    }

}
