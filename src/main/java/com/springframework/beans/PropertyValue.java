package com.springframework.beans;

/**
 * @author haonan.wen
 * @createTime 2022/5/25 下午12:45
 */
public class PropertyValue {

    private final String name;

    private final String value;

    public PropertyValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}