package com.ylb.product.service.impl;

import com.ylb.product.mapper.ProductMapper;
import com.ylb.product.pojo.Product;
import com.ylb.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Integer create(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public List<Product> queryAll() {
        return productMapper.selectAll();
    }

    @Override
    public Product getproduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateproduct(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }

    @Override
    public Integer delete(Integer id) {
        return productMapper.deleteByPrimaryKey(id);
    }
}
