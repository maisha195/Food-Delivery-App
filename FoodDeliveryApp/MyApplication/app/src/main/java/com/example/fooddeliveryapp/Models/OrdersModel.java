package com.example.fooddeliveryapp.Models;

public class OrdersModel {
    int orderImage;
    String soldItemName;
    String price;
    String  orderNumber;

    public OrdersModel() {
        this.orderImage = orderImage;
        this.soldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderName(String orderName) {
        this.orderNumber = orderNumber;
    }

    public void setOrderNumber(String s) {
    }
}
