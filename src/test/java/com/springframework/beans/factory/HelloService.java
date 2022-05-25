package com.springframework.beans.factory;

/**
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:18
 */
public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
