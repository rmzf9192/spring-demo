package com.el.spring.servlet;


import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 10:53
 * @Version:V1.0
 * @Description:UserFilter
 */
public class UserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter...init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         // 过滤请求
        System.out.println("UserFilter...doFilter...");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("UserFilter...destroy...");
    }
}
