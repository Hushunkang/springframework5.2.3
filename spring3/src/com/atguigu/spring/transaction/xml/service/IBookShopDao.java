package com.atguigu.spring.transaction.xml.service;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public interface IBookShopDao {

    //根据书号获取书的单价
    int findBookPriceByIsbn(String isbn);

    //更新书的库存，使得书号对应的库存-1
    void updateBookStock(String isbn);

    //更新用户账户的余额，使得username的balance-price
    void updateUserAccount(String username, int price);

}
