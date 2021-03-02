package com.lypowernode.Exception;

// 自定义的运行异常
public class NotenoughException extends RuntimeException {
    public NotenoughException() {
        super();
    }

    public NotenoughException(String message) {
        super(message);
    }
}
