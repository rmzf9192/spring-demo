package com.el.spring.annotation.config;

import com.el.spring.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 10:45
 * @Version:V1.0
 * @Description:MainConfigOfPropertyValues
 */
@PropertySource("classpath:/person.properties")
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Person person(){
        return new Person();
    }
}
