package config;

/**
 * Created by TYTY on 2020/10/19 21:51
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * Spring连接数据库相关配置类
 */
//@Configuration 使用@ComponentScan("")扫描包时需要
public class JdbcConfig {
    @Bean(name="runner")
    @Scope("prototype")
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
