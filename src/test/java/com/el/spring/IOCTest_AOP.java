package com.el.spring;

import com.el.spring.annotation.aop.MathCalculator;
import com.el.spring.annotation.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 14:22
 * @Version:V1.0
 * @Description:IOCTest_AOP
 */
public class IOCTest_AOP {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        int div = mathCalculator.div(1, 1);
        System.out.println("div:"+div);
        applicationContext.close();
    }

}
