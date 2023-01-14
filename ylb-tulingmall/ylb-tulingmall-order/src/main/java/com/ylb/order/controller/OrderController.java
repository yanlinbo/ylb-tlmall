package com.ylb.order.controller;



import com.ylb.order.pojo.Order;
import com.ylb.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    // 插入订单信息
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Order order){

        orderService.create(order);
        return "下单成功";
    }

    // 查询订单信息订单信息
    @RequestMapping("/query")
    public List<Order> query(){

        return orderService.queryAll();
    }

    // 查询订单想详情信息
    @RequestMapping("/getOrder/{orderId}")
    public Order getOrder(@PathVariable Integer orderId){

        return orderService.getOrder(orderId);
    }

    // 更新订单
    @RequestMapping("/updateOrder")
    public Integer updateOrder(@RequestBody Order order){

        return orderService.updateOrder(order);
    }

    // 更新订单
    @RequestMapping("/deleteOrder/{id}")
    public Integer deleteOrder(@PathVariable Integer id){
        Order order = new Order();
        order.setId(id);
        return orderService.updateOrder(order);
    }
}
