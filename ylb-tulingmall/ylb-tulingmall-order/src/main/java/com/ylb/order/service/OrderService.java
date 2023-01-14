package com.ylb.order.service;


import com.ylb.order.pojo.Order;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */

public interface OrderService {

     Order create(Order order);

     List<Order> queryAll();

     Order getOrder(Integer id);

     Integer updateOrder(Order order);

}
