package com.springframework.beans.factory;

import com.springframework.beans.BeansException;

/**
 * bean容器
 *
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:05
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;
}
