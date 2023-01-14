package com.ylb.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="tl-stock",path="/stock")
public interface StockService {

    @RequestMapping("/reduct")
    public String reduct(@RequestParam(value = "productId") Integer productId);
}
