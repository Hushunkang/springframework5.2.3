package com.atguigu.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
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
    //1.使用propagation属性指定事务的传播行为，即当前的事务方法被另外一个事务方法调用时
    //事务的规则是咋样滴, 默认取值为Propagation.REQUIRED，即使用调用方法的事务
    @Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false,timeout=-1)
    //Propagation.REQUIRES_NEW表示当前方法新开启一个事务，当前方法（被调用方法）和调用方法使用的不是同一个事务
//    @Transactional(propagation=Propagation.REQUIRES_NEW)
    //2.使用isolation属性指定事务的隔离级别，最常用的取值为READ_COMMITTED读已提交
    //3.默认情况下，spring的声明式事务对所有的运行时异常进行回滚. 也可以通过rollbackFor属性进行设置，通常情况下使用默认即可
    //4.使用readOnly属性指定事务是否为只读，表示这个事务只读数据但不写数据，这样可以帮助数据库引擎优化事务
    //5.使用timeout属性（单位：秒）指定强制回滚事务之前事务可以占用的时间，防止一个数据库事务对一个数据库连接对象占用时间过长，以提高整体运行性能
    //原本这个事务可以执行成功，但是由于各种原因导致这个事务超时了，那么就强制回滚事务！！！
    public void purchase(String username, String isbn) {
        //获取书的单价
        int price = bookShopDao.findBookPriceByIsbn(isbn);

        //更新书的库存
        bookShopDao.updateBookStock(isbn);

        //更新用户的账户余额
        bookShopDao.updateUserAccount(username,price);
    }

}
