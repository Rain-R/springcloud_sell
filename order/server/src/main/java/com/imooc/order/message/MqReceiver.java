package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: wz
 * @Date: 2019/5/7 16:45
 * @Description:
 */
@Slf4j
@Component
public class MqReceiver {
    @RabbitListener(queuesToDeclare =@Queue("myQueue"))
    public void process(String message){
          log.info("mqreceiver:{}",message);
    }
}
