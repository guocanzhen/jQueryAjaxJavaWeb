package com.canzhen.mapper;

import com.canzhen.bean.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> getGoodsInfoByStatus(int status);

    Boolean insert(Goods goods);

    Boolean updateById(Goods goods);

}
