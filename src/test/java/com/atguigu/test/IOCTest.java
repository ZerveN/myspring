package com.atguigu.test;

import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String bean: beanDefinitionNames){
            System.out.println(bean);
        }

        Object bean = annotationConfigApplicationContext.getBean("person");
        Object bean2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(bean==bean2);

    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String bean: beanDefinitionNames){
            System.out.println(bean);
        }
    }
}
