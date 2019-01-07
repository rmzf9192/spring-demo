package com.el.spring.annotation.config;

import com.el.spring.annotation.bean.Car;
import com.el.spring.annotation.bean.Color;
import com.el.spring.annotation.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 11:15
 * @Version:V1.0
 * @Description:MainConifgOfAutowired
 */
@Configuration
@ComponentScan({"com.el.spring.annotation.controller","com.el.spring.annotation.service",
        "com.el.spring.annotation.dao","com.el.spring.annotation.bean"})
public class MainConifgOfAutowired {
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }

    /**
     * @Bean标注的方法创建对象的时候，方法参数的值从容器中获取
     * @param car
     * @return
     */
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
