package com.wang.learn.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/20/2018
 * Time:4:59 PM
 */
@Component
@RabbitListener(queues = "test")
public class Receive {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}
