package com.wang.learn.consumer.dao.admin;

import com.wang.learn.consumer.domain.admin.MallApp;

import java.util.List;

public interface MallAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_mall_app
     *
     * @mbggenerated
     */
    int insert(MallApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_mall_app
     *
     * @mbggenerated
     */
    int insertSelective(MallApp record);

    List<MallApp> find();
}