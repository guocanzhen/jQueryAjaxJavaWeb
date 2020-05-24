package com.canzhen.serviceimpl;

import com.canzhen.bean.Goods;
import com.canzhen.mapper.GoodsMapper;
import com.canzhen.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsInfoByStatus(int status) {
        return goodsMapper.getGoodsInfoByStatus(status);
    }
}
