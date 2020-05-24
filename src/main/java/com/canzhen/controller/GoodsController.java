package com.canzhen.controller;

import com.alibaba.fastjson.JSONObject;
import com.canzhen.bean.Goods;
import com.canzhen.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger log = LoggerFactory.getLogger(GoodsController.class);

    @GetMapping
    public String goodsShow() {
        return "goodsShow";
    }

    @Autowired
    private GoodsService goodsService;

    @ResponseBody
    @RequestMapping(value = "/getGoodsInfoByStatus", method = RequestMethod.POST)
    public List<Goods> getGoodsInfoByStatus(@RequestBody JSONObject request) {
        return goodsService.getGoodsInfoByStatus(request.getInteger("status"));
    }
}
