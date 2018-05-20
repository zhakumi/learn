package com.wang.learn.consumer.biz;

import com.wang.learn.consumer.domain.oms.User;

import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:8:46 AM
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
