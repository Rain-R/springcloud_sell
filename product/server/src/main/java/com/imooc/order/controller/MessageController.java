package com.imooc.order.controller;

import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: wz
 * @Date: 2019/5/9 12:31
 * @Description: springcloud-stream发送消息
 */
@RestController
public class MessageController {
    @Autowired
    private StreamClient streamClient;
    @RequestMapping("/sendMsg")
    public void sendMsg(){
        String msg="now"+ new Date();
        this.streamClient.output().send(MessageBuilder.withPayload(msg).build());

    }
}
