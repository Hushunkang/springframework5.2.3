package com.atguigu.spring.transaction.xml;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年03月25日
 */
public class UserAccountException extends RuntimeException {

    private static final long serialVersionUID = 948986599068671862L;

    public UserAccountException() {
        super();
    }

    public UserAccountException(String message) {
        super(message);
    }

    public UserAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAccountException(Throwable cause) {
        super(cause);
    }

    public UserAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
