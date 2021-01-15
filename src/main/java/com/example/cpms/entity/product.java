package com.example.cpms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class product {

    @Id
    @GeneratedValue
    int id;
    String name;

    //ManyToMany relation ship and fix the name of join table and column
    @ManyToMany
    @JoinTable(name = "product_category",
    joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    //Owing side of relation ship
    private List<category> categories=new ArrayList<>();

    public product() {
    }

    public product(String name) {
        this.name = name;
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

    public List<category> getCategories() {
        return categories;
    }

    public void addCategory(category category) {
        this.categories.add(category);
    }
}
