package com.canzhen.config;

import com.canzhen.service.GoodsService;
import com.canzhen.serviceimpl.GoodsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoodsConfig {
    @Bean
    public GoodsService goodsService(){
        return new GoodsServiceImpl();
    }
}
