package com.wang.learn.biz.oms;


import com.wang.learn.domain.oms.User;

import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/15/2018
 * Time:10:10 PM
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
