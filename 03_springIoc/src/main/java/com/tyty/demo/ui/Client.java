package com.tyty.demo.ui;

/**
 * Created by TYTY on 2020/9/17 20:59
 */

import com.tyty.demo.dao.AccountDao;
import com.tyty.demo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层,用于调用业务层
 */
public class Client {
    /**
     * 获取spring的Ioc核心容器,并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        // 1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.根据id获取Bean对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        AccountDao adao = ac.getBean("accountDao",AccountDao.class);

        System.out.println(as);
        System.out.println(adao);
    }
}
