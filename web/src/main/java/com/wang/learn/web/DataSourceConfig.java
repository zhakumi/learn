package com.wang.learn.web;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:09 PM
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "omsDataSource")
    @ConfigurationProperties(prefix="spring.datasource.oms")
    public DataSource omsDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "adminDataSource")
    @ConfigurationProperties(prefix="spring.datasource.admin")
    public DataSource adminDataSource() {
        return DataSourceBuilder.create().build();
    }

}
