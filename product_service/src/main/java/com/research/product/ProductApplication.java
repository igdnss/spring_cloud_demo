package com.research.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/6 22:51
 * @description：${description}
 */
@SpringBootApplication
@EntityScan("com.research.product.entity")
//激活EurekaClient
@EnableEurekaClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
