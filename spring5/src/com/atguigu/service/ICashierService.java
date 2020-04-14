package com.atguigu.service;

import java.util.List;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public interface ICashierService {

    //用户一次性可以买多本书
    void checkout(String username, List<String> isbns);

}
