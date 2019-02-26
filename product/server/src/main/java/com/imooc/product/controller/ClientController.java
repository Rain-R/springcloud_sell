package com.imooc.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wz
 * @Date: 2019/2/25 21:33
 * @Description:
 */
@RestController
@RequestMapping("/clientTest")
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getMsg")
    public String getMessage(){

       String msg= restTemplate.getForObject("http://PRODUCT/msg",String.class);
        return msg;
    }

}
