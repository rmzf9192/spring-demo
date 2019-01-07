package com.el.spring.annotation.config;

import com.el.spring.annotation.bean.Person;
import com.el.spring.annotation.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 14:53
 * @Version:V1.0
 * @Description:MainConfig
 */
//配置类==配置文件
@Configuration//告诉spring这是一个配置类
@ComponentScans(
        value = {
                @ComponentScan(value="com.el.spring.annotation",includeFilters = {
						//@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						//@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),
                        @Filter(type= FilterType.CUSTOM,classes={MyTypeFilter.class})
                },useDefaultFilters = false)
        }
)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    //给spring容器注册一个bean:类型为方法的返回值类型，id默认为方法名
    @Bean("person")
    public Person getPerson(){
        return new Person("lisi",20);
    }
}
