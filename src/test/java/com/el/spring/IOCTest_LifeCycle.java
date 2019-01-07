package com.el.spring;

import com.el.spring.annotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 15:42
 * @Version:V1.0
 * @Description:IOCTest_LifeCycle
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");

        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }

}
