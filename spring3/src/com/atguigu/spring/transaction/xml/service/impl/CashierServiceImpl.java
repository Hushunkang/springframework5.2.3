package com.atguigu.spring.transaction.xml.service.impl;

import com.atguigu.spring.transaction.xml.service.IBookShopService;
import com.atguigu.spring.transaction.xml.service.ICashierService;

import java.util.List;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 08时03分37秒
 */
public class CashierServiceImpl implements ICashierService {

    private IBookShopService bookShopService;

    public void setBookShopService(IBookShopService bookShopService) {
        this.bookShopService = bookShopService;
    }

    @Override
    public void checkout(String username, List<String> isbns) {
        for (String isbn : isbns) {
            bookShopService.purchase(username,isbn);
        }
    }

}
