package com.el.spring.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/7 13:59
 * @Version:V1.0
 * @Description:LogAspects：切面类
 */
//告诉Spring当前类是一个切面类
@Aspect
public class LogAspects {
    //抽取公共切面点
    //1.本类引用，2.其他的切面使用
    @Pointcut("execution(public int com.el.spring.annotation.aop.MathCalculator.*(..))")
    public void pointCut(){
    }

    //前置通知
    //@Before在目标方法之前切入；切入点表达式（指定在哪个方法切入）
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"运行。。。@Before:参数列表是：{"+ Arrays.asList(args) +"}");
    }

    @After("com.el.spring.annotation.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"结束。。。@After:参数列表是：{"+ Arrays.asList(args) +"}");
    }
    //JoinPoint一定要出现在参数表的第一位
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"正常。。。@AfterReturning:参数列表是：{"+result +"}");
    }

    @AfterThrowing(value = "pointCut()",throwing="exception")
    public void logThrow(JoinPoint joinPoint,Exception exception){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"异常。。。@AfterReturning:参数列表是：{"+exception +"}");
    }


}
