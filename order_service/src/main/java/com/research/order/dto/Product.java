package com.research.order.dto;

import java.math.BigDecimal;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/9 21:57
 */
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
