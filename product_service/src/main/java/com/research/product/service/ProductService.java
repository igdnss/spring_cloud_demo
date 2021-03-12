package com.research.product.service;

import com.research.product.entity.Product;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/6 22:43
 * @description：${业务层}
 */
public interface ProductService {
    Product findById(Long id);
}
