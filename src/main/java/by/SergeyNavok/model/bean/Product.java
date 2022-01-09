package by.SergeyNavok.model.bean;

import java.sql.Blob;

public class Product {
    private int id;
    private int category;
    private String name;
    private String description;
    private int price;

    //
    private byte[] img;

    public Product(int id, int category, String name, String description, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //
    public Product(int id, int category, String name, String description, int price, byte[] img) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    //
    public byte[] getImg() {
        return img;
    }
}