package com.ylb.order.order.service.impl;


import com.ylb.order.order.mapper.OrderMapper;
import com.ylb.order.order.pojo.Order;
import com.ylb.order.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 下单
     *
     * @return
     */
//    @Transactional
    @Override
    public Order create(Order order) {
        // 插入能否成功？
        orderMapper.insert(order);


        // 扣减库存 能否成功？
        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("productId", order.getProductId());

        String msg = restTemplate.postForObject("http://localhost:8071/stock/reduct", paramMap, String.class);

        // 异常
        int a = 1 / 0;

        return order;
    }
}
