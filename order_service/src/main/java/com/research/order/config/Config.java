package com.research.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：TS六道轮回
 * @date ：Created in 2021/3/9 22:02
 */
@Configuration
public class Config {
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
