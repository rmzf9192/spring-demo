package com.el.spring;

import com.el.spring.annotation.bean.Blue;
import com.el.spring.annotation.bean.Person;
import com.el.spring.annotation.config.MainConfig;
import com.el.spring.annotation.config.MainConfig2;
import com.el.spring.annotation.dao.BookDao;
import lombok.val;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 16:52
 * @Version:V1.0
 * @Description:IOCTest
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
    @Test
    public void testImport(){
        printBeans(applicationContext);
        Blue bean = applicationContext.getBean(Blue.class);
        System.out.println(bean);

        //工厂Bean获取的是调用getObject创建的对象
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型："+bean2.getClass());
        System.out.println(bean2 == bean3);

        Object bean4 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean4.getClass());
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
    @Test
    public void test03(){
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        String property = environment.getProperty("os.name");
        System.out.println("property:"+property);

        for(val v:beanNamesForType){
            System.out.println(v);
        }
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test02(){
       // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//		String[] definitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name : definitionNames) {
//			System.out.println(name);
//		}
//
        System.out.println("ioc容器创建完成....");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
    }
   @Test
    public void test01(){
       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);


       String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

       BookDao bean = applicationContext.getBean(BookDao.class);
       System.out.println("bookDao:"+bean);
       for(val name:beanDefinitionNames){
           System.out.println("name:"+name);
       }
   }
}
