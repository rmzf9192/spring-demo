package com.el.spring.annotation.aop;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 13:58
 * @Version:V1.0
 * @Description:MathCalculator
 */
public class MathCalculator {
    public int div(int i,int j){
        int num=0;
        try {
            System.out.println("MathCalculator......div....");
            num= i/j;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return num;
        }

    }
}
