package com.imooc.producttest.service;

import com.imooc.producttest.ProductTestApplication;
import com.imooc.producttest.ProductTestApplicationTests;
import com.imooc.producttest.dataobject.ProductInfo;
import com.imooc.producttest.service.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: wz
 * @Date: 2018/8/19 21:48
 * @Description:
 */
@Component
public class ProductServiceTest extends ProductTestApplicationTests{

    @Autowired
    private ProductService productService;

    @Test
    public void findAllProducts() {
        List<ProductInfo> productInfos=this.productService.findAllProducts();

        Assert.assertTrue(productInfos.size()>0);
    }
}