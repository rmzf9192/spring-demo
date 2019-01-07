package com.el.spring.annotation.condition;

import com.el.spring.annotation.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/5 20:24
 * @Version:V1.0
 * @Description:MyImportBeanDefinitionRegistrar
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata：当前类的注解信息
     * BeanDefinitionRegistry:BeanDefinition注册类；
     * 		把所有需要添加到容器中的bean；调用
     * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean b = beanDefinitionRegistry.containsBeanDefinition("com.el.spring.annotation.bean.Red");
        boolean b1 = beanDefinitionRegistry.containsBeanDefinition("com.el.spring.annotation.bean.Blue");

        if(b&&b1){
            //指定Bean定义信息；（Bean的类型，Bean。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个Bean，指定bean名
            beanDefinitionRegistry.registerBeanDefinition("rainBow", beanDefinition);
        }

    }
}
