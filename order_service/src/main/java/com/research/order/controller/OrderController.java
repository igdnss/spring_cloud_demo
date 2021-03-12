package com.research.order.controller;

import com.research.order.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/9 21:48
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/buy/{id}")
    public Product findById(@PathVariable Long id) {
        Product product = null;
        //真正的开发过程这部分代码应该放到service层里
        product = restTemplate.getForObject("http://localhost:9001/product/"+id,Product.class);
        return product;
    }
}
