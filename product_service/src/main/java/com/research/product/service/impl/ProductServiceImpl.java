package com.research.product.service.impl;

import com.research.product.dao.ProductDao;
import com.research.product.entity.Product;
import com.research.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：cn406c0
 * @date ：Created in 2021/3/6 22:44
 * @description：${description}
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public Product findById(Long id) {
        Product product = productDao.findById(id).get();
        System.out.println(product.getName());
        return product;
    }
}
