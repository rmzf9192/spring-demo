package com.el.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/4 16:47
 * @Version:V1.0
 * @Description:BookDao
 */
//名字默认是类名首字母小写
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }

}
