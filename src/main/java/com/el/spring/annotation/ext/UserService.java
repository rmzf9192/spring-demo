package com.el.spring.annotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 17:05
 * @Version:V1.0
 * @Description:UserService
 */
@Service
public class UserService {

    @EventListener(classes={ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("UserService。。监听到的事件："+event);
    }

}