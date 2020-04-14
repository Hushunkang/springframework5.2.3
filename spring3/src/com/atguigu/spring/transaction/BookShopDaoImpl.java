package com.atguigu.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
@Repository("bookShopDao")
public class BookShopDaoImpl implements IBookShopDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findBookPriceByIsbn(String isbn) {
        String sql = "select price from book where isbn=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }

    //说明：mysql数据库不支持表字段的check约束，写了check约束也没作用

    @Override
    public void updateBookStock(String isbn) {
        //检查书的库存是否足够，若不够，则抛出异常，一次购买，只能一种类型的书的数量为1
        String checkSql = "select stock from book_stock where isbn=?";
        int stock = jdbcTemplate.queryForObject(checkSql,Integer.class,isbn);
        if (stock <= 0) {
            throw new BookStockException("很抱歉，库存不足！");
        }

        String sql = "update book_stock set stock=stock-1 where isbn=?";
        jdbcTemplate.update(sql,isbn);
    }

    @Override
    public void updateUserAccount(String username, int price) {
        //检查账户余额是否足够
        String checkSql = "select balance from account where username=?";
        double balance = jdbcTemplate.queryForObject(checkSql,Double.class,username);
        if (balance < price) {
            throw new UserAccountException("很抱歉，您的账户余额不足！");
        }

        String sql = "update account set balance=balance-? where username=?";
        jdbcTemplate.update(sql,price,username);
    }

}
