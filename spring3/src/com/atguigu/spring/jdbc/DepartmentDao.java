package com.atguigu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 05时04分19秒
 */
@Repository
public class DepartmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;//spring JdbcTemplate这是一个线程安全的类，因此可以在spring ioc容器中声明成单例的

    public Department getEmployeeById(Integer id){
        String sql = "select department_id id,department_name departmentName,manager_id managerId,location_id locationId from departments where department_id=?";
        RowMapper<Department> rowMapper = new BeanPropertyRowMapper<>(Department.class);
        Department department = jdbcTemplate.queryForObject(sql,rowMapper,id);
        return department;
    }

}
