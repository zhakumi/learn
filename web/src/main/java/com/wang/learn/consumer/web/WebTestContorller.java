package com.wang.learn.consumer.web;


import com.wang.learn.consumer.biz.MallAppService;
import com.wang.learn.consumer.biz.UserService;
import com.wang.learn.consumer.domain.oms.User;
import com.wang.learn.consumer.domain.admin.MallApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/17/2018
 * Time:8:19 AM
 */
@RestController
public class WebTestContorller {
    @Autowired
    private UserService userService;
    @Autowired
    private MallAppService mallAppService;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public String assUser() {
        userService.addUser(new User(){{setEmail("aaaa");}});
        return null;
    }

    @RequestMapping("/list")
    public String listUser() {
        List<User> users=userService.findAllUser(1,5);
        return null;
    }

    @RequestMapping("/mallList")
    public String listMall() {
        List<MallApp> malls=mallAppService.find(1,5);
        return null;
    }



}
