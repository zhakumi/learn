package com.wang.learn.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/20/2018
 * Time:9:35 PM
 */

@Component
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessage Receiver  : " +msg);
    }
}
