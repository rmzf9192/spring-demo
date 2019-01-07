package com.el.spring.annotation.controller;

import com.el.spring.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 16:50
 * @Version:V1.0
 * @Description:BookController
 */
@Controller
public class BookController {
    private BookService bookService;
}
