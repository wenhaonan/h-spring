package com.springframework.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haonan.wen
 * @createTime 2022/5/25 上午11:52
 */
public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<String, Object>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
