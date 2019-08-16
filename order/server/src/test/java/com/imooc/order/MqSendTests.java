package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: wz
 * @Date: 2019/5/8 13:33
 * @Description:
 */
@Component
public class MqSendTests extends  OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue ","now"+new Date());
    }
}
