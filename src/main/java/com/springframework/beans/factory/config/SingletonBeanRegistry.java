package com.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:09
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
