package com.atguigu.spring.transaction.xml.service.impl;

import com.atguigu.spring.transaction.xml.service.IBookShopDao;
import com.atguigu.spring.transaction.xml.service.IBookShopService;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class BookShopServiceImpl implements IBookShopService {

    private IBookShopDao bookShopDao;

    public void setBookShopDao(IBookShopDao bookShopDao) {
        this.bookShopDao = bookShopDao;
    }

    public void purchase(String username, String isbn) {
        //获取书的单价
        int price = bookShopDao.findBookPriceByIsbn(isbn);

        //更新书的库存
        bookShopDao.updateBookStock(isbn);

        //更新用户的账户余额
        bookShopDao.updateUserAccount(username,price);
    }

}
