package com.wang.learn.consumer.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:4:08 PM
 */
@Configuration
@MapperScan(basePackages = {"com.wang.learn.dao.oms"}, sqlSessionFactoryRef = "omsSessionFactory")
public class OmsDataConfig {
    public static final String OMS_LOCATION = "classpath:mapping/oms/*.xml";
    @Value("${spring.mybatis.configLocation:classpath:mybatis-config.xml}")
    private String adminLocation;

    @Autowired
    private DataSource omsDataSource;

    @Bean
    public SqlSessionFactory omsSessionFactory() throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource oms=resourceLoader.getResource(adminLocation);
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(omsDataSource);
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(OMS_LOCATION);
        factoryBean.setMapperLocations(resource);
        factoryBean.setConfigLocation(oms);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate omsSessionTemplate() throws Exception {
        return new SqlSessionTemplate(omsSessionFactory());
    }

    /**
     * 事务配置  默认事务
     * @return
     */
    @Bean
    @Primary
    public PlatformTransactionManager platformTransactionManager(){
        return new DataSourceTransactionManager(omsDataSource);
    }
}
