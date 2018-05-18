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
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
