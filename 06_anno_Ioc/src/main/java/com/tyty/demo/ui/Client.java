package com.tyty.demo.ui;

/**
 * Created by TYTY on 2020/9/17 20:59
 */

import com.tyty.demo.dao.AccountDao;
import com.tyty.demo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层,用于调用业务层
 */
public class Client {
    /**
     * 获取spring的Ioc核心容器,并根据id获取对象
     *  ApplicationContext的三个常用实现类:
     *      ClassPathXmlApplicationContext: 它可以加载类路径下的配置文件,要求配置文件必须在类路径下,不在的话,加载不了
     *      FileSystemXmlApplicationContext: 它可以加载磁盘任意路径下的配置文件(必须有访问权限)
     *      AnnotationConfigApplicationContext: 它是用于读取注解创建容器的
     *  核心容器的两个接口引发的问题
     *   ApplicationContext: 适用于单例对象
     *      构建核心容器时,创建对象采用的策略是采用立即加载的方式.也就是说,只要一读取完配置文件马上就创建配置文件中的对象
     *   BeanFactory: 适用于多例对象
     *      他在构建核心容器时,创建对象采取的时延迟加载的方式.也就是说,什么时候根据id获取对象了,什么时候才是真正的创建对象
     *  @param args
     */
    public static void main(String[] args) {
        // 1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.根据id获取Bean对象
        AccountService as = ac.getBean("accountServiceImpl",AccountService.class);

        as.saveAccount();
    }
}
