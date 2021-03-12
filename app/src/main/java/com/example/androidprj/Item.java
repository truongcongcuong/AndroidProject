package com.example.androidprj;

public class Item {
    private  String itemName;
    private  String price;
    private int image;

    public Item(String itemName, String price, int image){
        this.itemName = itemName;
        this.price = price;
        this.image = image;

    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
