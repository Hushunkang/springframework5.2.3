package com.atguigu.spring.transaction;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 07时12分44秒
 */
public interface IBookShopService {

    //用户买书
    void purchase(String username,String isbn);

}
