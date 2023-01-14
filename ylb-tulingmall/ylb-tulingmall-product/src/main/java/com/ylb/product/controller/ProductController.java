package com.ylb.product.controller;

import com.ylb.product.pojo.Product;
import com.ylb.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * 查询产品详情
     * @param productId
     * @return
     */
    @RequestMapping(value = "/productInfo/{id}", method = RequestMethod.GET)
    public Product getProductInfo(@PathVariable Integer productId) {

        return productService.getproduct(productId);
    }

    /**
     * 查询所有产品
     * @return
     */
    @RequestMapping(value = "/queryAllProduct", method = RequestMethod.GET)
    public List<Product> queryAllProduct() {

        return productService.queryAll();
    }

    /**
     * 添加产品
     * @return
     */
    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
    public Integer createProduct(@RequestBody Product product) {

        return productService.create(product);
    }

    /**
     * 更新产品
     * @return
     */
    @RequestMapping(value = "/updaeProduct", method = RequestMethod.POST)
    public Integer updaeProduct(@RequestBody Product product) {

        return productService.updateproduct(product);
    }

    /**
     * 删除产品产品
     * @return
     */
    @RequestMapping(value = "/deleteProduct/{productId}", method = RequestMethod.POST)
    public Integer deleteProduct(@PathVariable Integer productId) {

        Product product = new Product();
        product.setId(productId);
        return productService.updateproduct(product);
    }

}
