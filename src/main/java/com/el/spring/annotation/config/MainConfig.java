package com.el.spring.annotation.config;

import com.el.spring.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 14:53
 * @Version:V1.0
 * @Description:MainConfig
 */
//配置类==配置文件
@Configuration//告诉spring这是一个配置类

public class MainConfig {

    //给spring容器注册一个bean:类型为方法的返回值类型，id默认为方法名
    @Bean("person")
    public Person getPerson(){
        return new Person("lisi",20);
    }
}
