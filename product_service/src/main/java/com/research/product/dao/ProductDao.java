package com.research.product.dao;

import com.research.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/6 22:39
 * @description：${description}
 */
public interface ProductDao extends JpaRepository<Product,Long>,JpaSpecificationExecutor<Product> {
}
