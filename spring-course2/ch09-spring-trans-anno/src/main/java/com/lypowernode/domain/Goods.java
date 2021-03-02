package com.lypowernode.domain;

public class Goods {
    private int id;
    private String name;
    private int amount;
    private int price;

    public Goods() {
    }

    public Goods(int id, String name, int amount, int price) {
        this.id = id;  // 商品的id编号
        this.name = name;
        this.amount = amount;// 商品的数量
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
