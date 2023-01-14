package com.ylb.product.service;


import com.ylb.product.pojo.Product;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */

public interface ProductService {

     Integer create(Product product);

     List<Product> queryAll();

     Product getproduct(Integer id);

     Integer updateproduct(Product product);

     Integer delete(Integer id);

}
