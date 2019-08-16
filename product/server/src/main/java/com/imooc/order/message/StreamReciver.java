package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: wz
 * @Date: 2019/5/9 12:33
 * @Description:
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReciver {

    @StreamListener("inputMsg")
    public void process(Object message){
         log.info("stream message reciver:{}"+message);
    }


}
