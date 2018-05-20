package com.wang.learn.consumer.biz.impl;

import com.github.pagehelper.PageHelper;
import com.wang.learn.consumer.biz.UserService;
import com.wang.learn.consumer.dao.oms.UserMapper;
import com.wang.learn.consumer.domain.oms.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:8:47 AM
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addUser(User user) {
        userMapper.insertSelective(user);
        throw  new RuntimeException();
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
