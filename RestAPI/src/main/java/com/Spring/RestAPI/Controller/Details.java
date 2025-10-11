package com.Spring.RestAPI.Controller;

public class Details {
    private int id;
    private String name;

    public Details(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Details() {

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
}
