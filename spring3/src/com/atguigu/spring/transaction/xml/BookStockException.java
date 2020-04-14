package com.atguigu.spring.transaction.xml;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class BookStockException extends RuntimeException {

    //idea自动生成serialVersionUID设置方式:https://blog.csdn.net/zhan_zehong/article/details/53378598
    private static final long serialVersionUID = -743966077648447691L;

    public BookStockException() {
        super();
    }

    public BookStockException(String message) {
        super(message);
    }

    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockException(Throwable cause) {
        super(cause);
    }

    public BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
