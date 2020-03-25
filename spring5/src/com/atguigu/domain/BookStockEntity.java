package com.atguigu.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日 10时28分18秒
 */
@Entity
//@Table(name = "book_stock", schema = "myemployees", catalog = "")
@Table(name = "book_stock", schema = "myemployees")
public class BookStockEntity {
    private int isbn;
    private Integer stock;

    @Id
    @Column(name = "isbn")
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "stock")
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookStockEntity that = (BookStockEntity) o;
        return isbn == that.isbn &&
                Objects.equals(stock, that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, stock);
    }
}
