package com.xiaozhang.ssm.domain;

import java.util.Date;


/**
 * 产品信息
 */
public class Product {


    private String id;//主键
    private String productNum;//编号唯一
    private String productName;//名称
    private String cityName;//出发城市
    private Date departureTime;//出发时间
    private String departureTimeStr;
    private Double productPrice;//产品价格.30
    private String productDecs;//产品描述
    private Integer productStatus;//产品状态 0关闭  1开启
    private String productStatusStr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTimeStr() {
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDecs() {
        return productDecs;
    }

    public void setProductDecs(String productDecs) {
        this.productDecs = productDecs;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }
}