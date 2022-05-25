package com.springframework.beans.factory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author haonan.wen
 * @createTime 2022/5/25 上午11:55
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello spring");
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello spring");
            return "hello spring";
        }
    }
}
