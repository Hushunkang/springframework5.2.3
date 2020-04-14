package com.atguigu.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
@Entity
//@Table(name = "book", schema = "myemployees", catalog = "")
@Table(name = "book", schema = "myemployees")
public class BookEntity {

    private int isbn;
    private String bookName;
    private Integer price;

    @Id
    @Column(name = "isbn")
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return isbn == that.isbn &&
                Objects.equals(bookName, that.bookName) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, bookName, price);
    }

}
