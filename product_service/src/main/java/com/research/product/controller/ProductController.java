package com.research.product.controller;

import com.research.product.entity.Product;
import com.research.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/6 22:47
 * @description：${description}
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }
}
