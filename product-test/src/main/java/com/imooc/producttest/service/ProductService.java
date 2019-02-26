package com.imooc.producttest.service;

import com.imooc.producttest.dataobject.ProductInfo;
import com.imooc.producttest.service.impl.ProductServiceImpl;

import java.util.List;

/**
 * @Auther: wz
 * @Date: 2018/8/19 21:35
 * @Description:
 */
public interface ProductService {
    List<ProductInfo> findAllProducts();
}
