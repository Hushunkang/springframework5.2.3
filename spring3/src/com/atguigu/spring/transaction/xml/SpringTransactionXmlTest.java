package com.atguigu.spring.transaction.xml;

import com.atguigu.spring.transaction.xml.service.IBookShopDao;
import com.atguigu.spring.transaction.xml.service.IBookShopService;
import com.atguigu.spring.transaction.xml.service.ICashierService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class SpringTransactionXmlTest {

    private ApplicationContext ctx;
    private IBookShopDao bookShopDao;
    private IBookShopService bookShopService;
    private ICashierService cashierService;

    {
        ctx = new ClassPathXmlApplicationContext("spring-tx-xml.xml");
        bookShopDao = (IBookShopDao) ctx.getBean("bookShopDao");
        bookShopService = (IBookShopService) ctx.getBean("bookShopService");
        cashierService = (ICashierService) ctx.getBean("cashierService");
    }

    @Test
    public void testPurchase(){
        bookShopService.purchase("Tom","1001");
    }

    @Test
    public void testTransactionPropagation(){
        cashierService.checkout("Tom", Arrays.asList("1001","1002"));
    }

}
