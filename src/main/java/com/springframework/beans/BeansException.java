package com.springframework.beans;

/**
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:03
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
