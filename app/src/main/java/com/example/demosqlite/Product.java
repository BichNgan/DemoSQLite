package com.example.demosqlite;

public class Product {
    int id;
    String name;
    int quatity;

    public Product(int id, String name, int quatity) {
        this.id = id;
        this.name = name;
        this.quatity = quatity;
    }
    public Product()
    {

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

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
}
