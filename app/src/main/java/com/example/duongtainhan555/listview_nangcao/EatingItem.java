package com.example.duongtainhan555.listview_nangcao;

public class EatingItem {
    private String name;
    private Integer price;
    private Integer image;

    public EatingItem(String name, Integer price, Integer image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getImage() {
        return image;
    }
}
