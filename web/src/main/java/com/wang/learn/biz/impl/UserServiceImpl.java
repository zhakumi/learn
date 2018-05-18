package com.wang.learn.biz.impl;

import com.github.pagehelper.PageHelper;
import com.wang.learn.biz.UserService;
import com.wang.learn.dao.oms.UserMapper;
import com.wang.learn.domain.oms.User;
import org.springframework.stereotype.Service;

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
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
