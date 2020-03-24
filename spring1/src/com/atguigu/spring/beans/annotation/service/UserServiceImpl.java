package com.atguigu.spring.beans.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 11时06分13秒
 */
@Service(value="userService")
public class UserServiceImpl implements IUserService {

    @Override
    public void save() {
        System.out.println("UserServiceImpl's save...");
    }

}
