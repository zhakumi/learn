package com.wang.learn.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.wang.learn")
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}
}
