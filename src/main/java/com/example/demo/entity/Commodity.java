package com.example.demo.entity;

public class Commodity {
    private int cid; //商品编号
    private String name;       //商品名称
    private double price;       //商品价格
    private int quantity;       //商品数量
    private double discount;    //折扣

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCid() {
        return cid;
    }

    public double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}