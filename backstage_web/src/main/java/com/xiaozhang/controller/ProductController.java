package com.xiaozhang.controller;


import com.xiaozhang.service.IProductService;
import com.xiaozhang.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView view = new ModelAndView();
        List<Product> list = productService.findAll();
        view.addObject("productList",list);
        view.setViewName("product-list");
        return view;
    }
}
