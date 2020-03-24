package com.atguigu.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 07时13分00秒
 */
@Service("bookService")
public class BookShopServiceImpl implements IBookShopService {

    @Autowired
    private IBookShopDao bookShopDao;

    //默认情况下，这个Service的purchase方法是不带有事务特性的，存在安全问题
    @Override
    @Transactional
    public void purchase(String username, String isbn) {
        //获取书的单价
        int price = bookShopDao.findBookPriceByIsbn(isbn);

        //更新书的库存
        bookShopDao.updateBookStock(isbn);

        //更新用户的账户余额
        bookShopDao.updateUserAccount(username,price);
    }

}
