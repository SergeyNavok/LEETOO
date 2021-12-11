package by.SergeyNavok.model.bean;

public class Product {
    private int id;
    private int category;
    private String name;
    private String description;

    public Product(int id, int category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public Product(int id, int category, String name, String description) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
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