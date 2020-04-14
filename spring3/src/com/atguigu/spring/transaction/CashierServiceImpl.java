package com.atguigu.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
@Service("cashierService")
public class CashierServiceImpl implements ICashierService {

    @Autowired
    private IBookShopService bookShopService;

    @Override
    @Transactional
    public void checkout(String username, List<String> isbns) {
        for (String isbn : isbns) {
            bookShopService.purchase(username,isbn);
        }
    }

}
