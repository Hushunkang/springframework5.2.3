package com.atguigu.spring.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 06时25分38秒
 */
public class SpringTransactionTest {

    private ApplicationContext ctx;
    private IBookShopDao bookShopDao;
    private IBookShopService bookShopService;
    private IBookShopService bookShopService2;

    {
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        bookShopDao = (IBookShopDao) ctx.getBean("bookShopDao");
//        bookShopService = ctx.getBean(IBookShopService.class);//这种获取bean的方式要求spring ioc容器中至多有一个与该接口相适配的bean
//        bookShopService = ctx.getBean(BookShopServiceImpl.class);
////        bookShopService2 = ctx.getBean(TestServiceImpl.class);
        System.out.println(ctx.getBean("bookService").getClass());//class com.atguigu.spring.transaction.BookShopServiceImpl 或者 class com.sun.proxy.$Proxy15
        bookShopService = (IBookShopService) ctx.getBean("bookService");
    }

    @Test
    public void testFindBookPriceByIsbn(){
        System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
    }

    @Test
    public void testUpdateBookStock(){
        bookShopDao.updateBookStock("1001");
    }

    @Test
    public void testUpdateUserAccount(){
        bookShopDao.updateUserAccount("Tom",1000);
    }

    @Test
    public void testPurchase(){
        bookShopService.purchase("Tom","1001");
    }

}
