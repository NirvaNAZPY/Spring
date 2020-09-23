package com.tyty.demo.service.Impl;

import com.tyty.demo.dao.AccountDao;
import com.tyty.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

/**
 * 账户的业务层实现类
 *  曾经xml的配置:<bean
 *                  id="accountService"
 *                  class="com.tyty.demo.service.Impl.AccountServiceImpl"
 *                  scope=""
 *                  init-method=""
 *                  destroy-method=""
 *              >
 *                  <property name="" value="" ref=""></property>
 *              </bean>
 *  注解分类:
 *      1.用于创建对象的->等同于xml中的bean标签
 *          (1).@Component:
 *              作用:用于把当前类对象存入Spring容器中
 *              属性:
 *                  value:用于指定bean的id,当不赋值时,默认值是当前类名,且首字母改小写
 *          (2).@Controller:
 *              作用:一般用于表现层
 *          (3).@Service
 *              作用:一般用于业务层
 *          (4).@Repository
 *              作用:一般用于持久层
*           以上三个注解作用与@Component一样,使三层对象更加清晰
 *      2.用于注入数据的->等同于bean标签中的property标签的作用
 *          (1).Autowired
 *              作用:自动按照类型注入,只要容器中有唯一的一个bean对象,和要注入的变量类型匹配,就可以注入成功.
 *                  如果ioc容器中没有任何bean的类型喝药注入的变量类型匹配,则报错.
 *                  如果ioc容器中有多个类型匹配时,然后使用变量名称作为bean的id继续查找,若有相同的,成功;若都不一样,报错.
 *              出现位置:
 *                  1.变量上
 *                  2.方法上
 *              细节:
 *                  使用注解注入时,set方法不是必要的
 *      3.用于改变作用范围的->等同于bean标签中的scope属性
 *      4.与生命周期相关->等同于bean标签中的 init-method destroy-method 属性
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDaoImpl1;

    public void saveAccount() {
        accountDaoImpl1.saveAccount();
    }
}
