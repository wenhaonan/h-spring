package com.springframework.beans.factory.support;


import com.springframework.beans.BeansException;
import com.springframework.beans.factory.config.BeanDefinition;

/**
 * bean的实例化策略
 *
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:35
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        //TODO
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}
