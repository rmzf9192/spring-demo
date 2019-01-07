package com.el.spring;

import com.el.spring.annotation.ext.ExtConfig;
import com.el.spring.annotation.ext.MyApplicationListener;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 16:28
 * @Version:V1.0
 * @Description:IOCTest_Ext
 */
public class IOCTest_Ext {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);

        MyApplicationListener bean = applicationContext.getBean(MyApplicationListener.class);
        System.out.println(bean);

        //发布事件；
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });


        applicationContext.close();
    }
}
