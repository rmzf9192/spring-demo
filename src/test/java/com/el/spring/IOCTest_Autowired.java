package com.el.spring;

import com.el.spring.annotation.bean.Boss;
import com.el.spring.annotation.bean.Car;
import com.el.spring.annotation.bean.Color;
import com.el.spring.annotation.bean.Person;
import com.el.spring.annotation.config.MainConifgOfAutowired;
import com.el.spring.annotation.dao.BookDao;
import com.el.spring.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 11:17
 * @Version:V1.0
 * @Description:IOCTest_Autowired
 */
public class IOCTest_Autowired {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);

        System.out.println("bookService:"+bookService);

        BookDao bookDao = applicationContext.getBean(BookDao.class);

        System.out.println("bookDao:"+bookDao);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println("boss:"+boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println("car："+car);
        Color color = applicationContext.getBean(Color.class);
        System.out.println("color:"+color);
        System.out.println("applicationContext："+applicationContext);
        applicationContext.close();


    }
}
