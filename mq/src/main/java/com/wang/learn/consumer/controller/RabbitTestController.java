package com.wang.learn.consumer.controller;

import com.wang.learn.consumer.HelloSender1;
import com.wang.learn.consumer.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/20/2018
 * Time:8:56 PM
 */

@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {

    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender1 helloSender2;
    @Autowired
    private TopicSender topicSender;

    /**
     * 一对一
     */
    @PostMapping("/hello")
    public void hello() {
        helloSender1.send("wangcan");
    }

    /**
     * 单生产者-多消费者
     */
    @PostMapping("/oneToMany")
    public void oneToMany() {
        for(int i=0;i<10;i++){
            helloSender1.send("hellomsg:"+i);
        }

    }

    /**
     * 多生产 多消费
     */
    @PostMapping("/manyToMany")
    public void manyToMany() {
        for(int i=0;i<10;i++){
            helloSender1.send("hellomsg:"+i);
            helloSender2.send("hellomsg:"+i);
        }
    }

    /**
     * 测试topic
     */
    @PostMapping("/topicTest")
    public void topicTest() {
        topicSender.send();
    }
}
