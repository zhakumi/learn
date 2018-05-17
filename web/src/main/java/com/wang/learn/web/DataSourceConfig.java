package com.wang.learn.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:09 PM
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.wang.learn"}, sqlSessionFactoryRef = "omsSessionFactory")
public class DataSourceConfig {


    public static final String MAPPER_LOCATION = "classpath:mapping/*.xml";

    @Autowired
    private DataSource omsDataSource;

    @Bean(name = "omsDataSource")
    @ConfigurationProperties(prefix="spring.datasource.oms")
    public DataSource omsDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory omsSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(omsDataSource);
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION);
        factoryBean.setMapperLocations(resource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        return new SqlSessionTemplate(omsSessionFactory());
    }


//    /**
//     * admin
//     * @return
//     */
//    @Bean(name = "adminDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.admin")
//    public DataSource adminDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//
//    @Bean
//    public SqlSessionFactory adminSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(adminDataSource());
//        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION);
//        factoryBean.setMapperLocations(resource);
//        return factoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate adminSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(omsSessionFactory());
//    }

}
