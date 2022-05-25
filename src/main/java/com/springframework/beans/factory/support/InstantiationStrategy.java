package com.springframework.beans.factory.support;

import com.springframework.beans.BeansException;
import com.springframework.beans.factory.config.BeanDefinition;

/**
 * bean的实例化策略
 *
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:35
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
