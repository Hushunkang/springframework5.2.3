package com.atguigu.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日
 */
//@Repository(value="userRepository")
@Repository
public class UserRepositoryImpl implements IUserRepository {

    @Override
    public void save() {
        System.out.println("UserRepositoryImpl's save...");
    }

}
