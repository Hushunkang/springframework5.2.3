package com.atguigu.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 07时13分00秒
 */
@Service("bookShopService")
public class BookShopServiceImpl implements IBookShopService {

    @Autowired
    private IBookShopDao bookShopDao;

    //默认情况下，这个Service的purchase方法是不带有事务特性的，存在安全问题
    @Override
    //使用propagation属性指定事务的传播行为，即当前的事务方法被另外一个事务方法调用时
    //事务的规则是咋样滴, 默认取值为Propagation.REQUIRED，即使用调用方法的事务
    @Transactional(propagation=Propagation.REQUIRED)
    //Propagation.REQUIRES_NEW表示当前方法新开启一个事务，当前方法（被调用方法）和调用方法使用的不是同一个事务
//    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void purchase(String username, String isbn) {
        //获取书的单价
        int price = bookShopDao.findBookPriceByIsbn(isbn);

        //更新书的库存
        bookShopDao.updateBookStock(isbn);

        //更新用户的账户余额
        bookShopDao.updateUserAccount(username,price);
    }

}
