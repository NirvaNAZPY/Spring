package com.tyty.demo.ui;

/**
 * Created by TYTY on 2020/9/17 20:59
 */

import com.tyty.demo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层,用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        // 1.获取核心容器对象
        // ApplicationContext接口中无close方法
        // ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.根据id获取Bean对象
        AccountService as = ac.getBean("AccountServiceImpl3",AccountService.class);
        as.saveAccount();
    }
}
