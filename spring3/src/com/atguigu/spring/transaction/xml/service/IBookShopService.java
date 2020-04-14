package com.atguigu.spring.transaction.xml.service;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public interface IBookShopService {

    //用户一次性只能买一本书
    void purchase(String username, String isbn);

}
