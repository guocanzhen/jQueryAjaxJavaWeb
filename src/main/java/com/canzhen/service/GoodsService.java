package com.canzhen.service;

import com.canzhen.bean.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsInfoByStatus(int status);
}
