package com.xiaozhang.service.Impl;

import com.xiaozhang.dao.IProductDao;
import com.xiaozhang.service.IProductService;
import com.xiaozhang.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;


    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
