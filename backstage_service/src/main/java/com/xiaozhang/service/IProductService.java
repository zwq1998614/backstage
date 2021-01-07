package com.xiaozhang.service;

import com.xiaozhang.ssm.domain.Product;

import java.util.List;

public interface IProductService {



    public List<Product> findAll() throws Exception;
}
