package com.imooc.producttest.repository;

import com.imooc.producttest.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:29
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);

    @Query("SELECT p FROM  ProductInfo p")
    List<ProductInfo> findById(Integer productStatus);

}
