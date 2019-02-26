package com.imooc.producttest.controller;

import com.imooc.producttest.VO.ProductInfoVO;
import com.imooc.producttest.VO.ProductVO;
import com.imooc.producttest.VO.ResultVO;
import com.imooc.producttest.dataobject.ProductCategory;
import com.imooc.producttest.dataobject.ProductInfo;
import com.imooc.producttest.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品
 * Created by 廖师兄
 * 2017-12-09 21:13
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public List<ProductInfo>list() {
        //1. 查询所有在架的商品

        return  productService.findAllProducts();
    }


}
