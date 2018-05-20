package com.wang.learn.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/20/2018
 * Time:4:59 PM
 */
@Component
public class HelloSender2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;



    public void send(String message){
        System.out.println("Sender2 : " + message);
        this.rabbitTemplate.convertAndSend("helloQueue", message);
    }
}
