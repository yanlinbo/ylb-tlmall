package com.ylb.order.order.controller;

import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/findOrder")
    @ResponseBody
    public String findOrder() {

        String orderNum = getOrderNum();
        System.out.println("查询到的订单: " + orderNum);
        return orderNum;
    }

    @Trace
    public String getOrderNum() {
        return "order001";
    }
}
