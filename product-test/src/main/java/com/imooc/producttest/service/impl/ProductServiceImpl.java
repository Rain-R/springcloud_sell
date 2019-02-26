package com.imooc.producttest.service.impl;

import com.imooc.producttest.dataobject.ProductInfo;
import com.imooc.producttest.repository.ProductInfoRepository;
import com.imooc.producttest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: wz
 * @Date: 2018/8/19 21:36
 * @Description:
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Override
    public List<ProductInfo> findAllProducts() {
        List<ProductInfo> objs=this.productInfoRepository.findById(0);

        return objs;
    }
}
