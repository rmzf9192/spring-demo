package com.el.spring;

import com.el.spring.annotation.bean.Person;
import com.el.spring.annotation.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 10:56
 * @Version:V1.0
 * @Description:IOCTest_PropertyValue
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
        System.out.println("====================");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println("person:"+person);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println("property:"+property);
        applicationContext.close();
    }
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
