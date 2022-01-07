package by.SergeyNavok.model.bean;

public class Product {
    private int id;
    private int category;
    private String name;
    private String description;
    private int price;

    public Product(int id, int category, String name, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Product(int id, int category, String name, String description, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
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
}