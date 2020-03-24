package com.atguigu.spring.beans.annotation.service;

import com.atguigu.spring.beans.annotation.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月24日 11时06分13秒
 */
@Service(value="userService")
public class UserServiceImpl implements IUserService {

//    @Autowired
    private IUserRepository userRepository;

    @Autowired
//    @Qualifier(value="userRepositoryImpl")
    public void setUserRepository(@Qualifier(value="userRepositoryImpl") IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl's save...");
        userRepository.save();
    }

}
