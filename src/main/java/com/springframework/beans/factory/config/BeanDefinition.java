package com.springframework.beans.factory.config;

import com.springframework.beans.PropertyValues;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，
 * 此处简化只包含class类型
 *
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:06
 */
public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;


    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}