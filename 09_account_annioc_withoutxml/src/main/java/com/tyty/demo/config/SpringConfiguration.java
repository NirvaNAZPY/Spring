package com.tyty.demo.config;

/**
 * Created by TYTY on 2020/9/27 17:45
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 该类是一个配置类,它的作用和bean.xml是一样的
 * spring中的新注解
 * @Configuration
 *  作用:指定当前类是一个配置类
 * @ComponentScan/@ComponentScans
 *  作用:用于通过注解指定spring在创建容器时要扫描的包
 *  属性:
 *      value:它和basePackage的作用是一样的,都是用于指定创建容器时要扫描的包,我们使用此注解等同于在xml中配置了
 *      <context:component-scan base-package="com.tyty"></context:component-scan>
 * @Bean
 *  作用:用于把当前方法的返回值作为Bean对象存入spring的ioc容器中
 *  属性:
 *      name:用于指定bean的id,当不写时默认值是当前方法的名称.
 *  细节:
 *      当我们使用注解配置方法时,如果方法有参数,spring框架回去容器中查找有没有可用bean对象
 *      查找的方式和@Autowired是一样的
 */
@Configuration
@ComponentScan("com.tyty")
public class SpringConfiguration {
    /**
     * 用于创建一个QueryRunner对象
     * @param dataSource
     * @return
     */
    @Bean(name="runner")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /**
     * 用于创建一个DataSource对象
     * @return
     */
    @Bean(name="dataSource")
    public DataSource createDataSource(){
        try{
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.cj.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/springdemo?serverTimezone=UTC ");
            ds.setUser("root");
            ds.setPassword("zpy@mysql");
            return ds;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}