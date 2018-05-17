package com.wang.learn.web;


import com.wang.learn.biz.oms.UserService;
import com.wang.learn.domain.oms.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/17/2018
 * Time:8:19 AM
 */
@RestController
public class WebTestContorller {

    @Resource
    private UserService userService;

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
}
