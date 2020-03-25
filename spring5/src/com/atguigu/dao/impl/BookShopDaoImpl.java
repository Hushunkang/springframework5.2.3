package com.atguigu.dao.impl;

import com.atguigu.dao.IBookShopDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 11时13分47秒
 */
@Repository("bookShopDao")
public class BookShopDaoImpl implements IBookShopDao {

    @Autowired
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的session
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public int findBookPriceByIsbn(String isbn) {
        return 0;
    }

    @Override
    public void updateBookStock(String isbn) {

    }

    @Override
    public void updateUserAccount(String username, int price) {

    }

}
