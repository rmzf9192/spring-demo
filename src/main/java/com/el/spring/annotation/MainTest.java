package com.el.spring.annotation;

import com.el.spring.annotation.bean.Person;
import com.el.spring.annotation.config.MainConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest {

	@SuppressWarnings("resource")//注解主要用在取消一些编译器产生的警告对代码左侧行列的遮挡，有时候这会挡住我们断点调试时打的断点
	public static void main(String[] args) {
		//读取resources下的beans.xml文件，利用Spring的反射，创建Person实例
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Person person = (Person) beanFactory.getBean("person");
		System.out.println(person);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = (Person) applicationContext.getBean("person");
		System.out.println(bean);
	/*
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		((AnnotationConfigApplicationContext) applicationContext).getBeanFactory();
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);

		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		}
	*/
	}

}
