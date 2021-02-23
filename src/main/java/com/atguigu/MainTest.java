package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name :names ){
            System.out.println(name);
        }
    }

}
