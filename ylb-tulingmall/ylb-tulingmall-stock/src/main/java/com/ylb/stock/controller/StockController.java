package com.ylb.stock.controller;


import com.ylb.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping("/reduct")
    public String reduct(@RequestParam(value="productId") Integer productId){
        stockService.reduct(productId);
        return "扣减库存";
    }

}
