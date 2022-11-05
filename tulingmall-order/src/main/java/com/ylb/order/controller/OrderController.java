package com.ylb.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/findOrder")
    @ResponseBody
    public void findOrder(){
        System.out.println("查询到的订单");
    }
}
