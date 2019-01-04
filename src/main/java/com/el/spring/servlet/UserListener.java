package com.el.spring.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 10:51
 * @Version:V1.0
 * @Description:UserListener
 *   监听项目的启动和停止
 */
public class UserListener implements ServletContextListener {
    //监听ServletContext初始化
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("UserListener...contextInitialized..."+servletContext);
    }
    //监听ServletContext销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("UserListener...contextDestroyed...");
    }
}
