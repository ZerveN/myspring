package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    // 默认是单实例的 增加一点注释
    @Scope
    @Bean("person")
    public Person person(){
        return new Person("李四",25);
    }
}
