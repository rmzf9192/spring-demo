package com.el.spring.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/5 14:56
 * @Version:V1.0
 * @Description:LinuxCondition
 */
//判读是否是linux系统
public class LinuxCondition implements Condition {
    /**
     * ConditionContext：判断条件能使用的上下文（环境）
     * AnnotatedTypeMetadata：注释信息
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取IOC的bean工厂
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //获取到当前环境
        Environment environment = conditionContext.getEnvironment();
        //获取到定义bean注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        //可以判断容器中bean注册的情况，也可以给容器中注册bean
        boolean person = registry.containsBeanDefinition("person");
        if(property.contains("Linux")){
            return true;
        }
        return false;
    }
}
