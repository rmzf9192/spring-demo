package com.el.spring;

import com.el.spring.annotation.tx.TxConfig;
import com.el.spring.annotation.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 17:14
 * @Version:V1.0
 * @Description:IOCTest_Tx
 */
public class IOCTest_Tx {
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(TxConfig.class);
    @Test
    public void test01(){
        UserService userService = applicationContext.getBean(UserService.class);
        printBeans(applicationContext);
        userService.insertUser();
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
