package com.wang.learn.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:4:15 PM
 *   admin 库配置文件
 */
@Configuration
@MapperScan(basePackages = {"com.wang.learn.dao.admin"}, sqlSessionFactoryRef = "adminSessionFactory")
public class AdminDataConfig {
    public static final String ADMIN_LOCATION = "classpath:mapping/admin/*.xml";

    @Autowired
    private DataSource adminDataSource;
    @Value("${spring.mybatis.configLocation:classpath:mybatis-config.xml}")
    private String omsLocation;



    @Bean
    public SqlSessionFactory adminSessionFactory() throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource admin=resourceLoader.getResource(omsLocation);
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(adminDataSource);
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(ADMIN_LOCATION);
        factoryBean.setConfigLocation(admin);
        factoryBean.setMapperLocations(resource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate adminSessionTemplate() throws Exception {
        return new SqlSessionTemplate(adminSessionFactory());
    }
}
