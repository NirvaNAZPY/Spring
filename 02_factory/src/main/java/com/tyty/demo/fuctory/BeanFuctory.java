package com.tyty.demo.fuctory;

/**
 * Created by TYTY on 2020/9/17 21:20
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 *
 * Bean:在计算机应用中,有可重用组件的含义
 * JavaBean:用java组件编写的可重用组件
 *      javaBean->实体类
 *
 *
 *      它就是创建我们的service和dao对象的
 *      1.需要一个配置文件来配置我们的service和dao
 *          配置内容:全限定类名,唯一标识 (唯一标识 = 全限定类名)(key = value)
 *      2.通过读取配置文件中配置的内容,反射创建对象
 */
public class BeanFuctory {

    // 定义一个Properties对象
    private static Properties props;

    // 定义一个map,用于存放我们要创建的对象,我们把它称之为容器
    private static Map<String,Object> beans;

    // 使用静态代码块为Properties对象赋值
    static {
        try{
            // 实例化对象
            props = new Properties();
            // 获取properties文件的流对象
            // InputStream in = new FileInputStream(); 缺点:1.若使用相对路径,打包后找不到2.使用绝对路径问题太多
            InputStream in = BeanFuctory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            // 实例化容器
            beans = new HashMap<String,Object>();
            // 取出配置文件中所有的key
            Enumeration keys = props.keys();
            while (keys.hasMoreElements()){
                // 取出每个key
                String key = keys.nextElement().toString();
                // 根据key获取value
                String beanPath = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(beanPath).getDeclaredConstructor().newInstance();
                // 把key和value存入容器之中
                beans.put(key,value);
            }
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    /**
     * 根据bean的名称,获取bean对象(多例版)
     * @param beanName
     * @return
     */
//    public static Object getBean(String beanName){
//        Object bean = null;
//        try{
//            String beanPath = props.getProperty(beanName);
//            /**
//             * newInstance()
//             * getDeclaredConstructor().newInstance()
//             * 每次都会调用默认构造函数创造对象
//             */
//            // bean = Class.forName(beanPath).newInstance(); java9以后不推荐使用newInstance()
//            bean = Class.forName(beanPath).getDeclaredConstructor().newInstance();
//            // System.out.println(bean);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return bean;
//    }

    /**
     * 根据bean的名称,获取bean对象(单例版)
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }
}
