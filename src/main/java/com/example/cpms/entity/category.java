package com.example.cpms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class category {

    @Id
    @GeneratedValue
    int id;
    String name;
    String parent;

    public category() {
    }

    public category(String name, String parent) {
        this.name = name;
        this.parent = parent;
    }

    public category(String name) {
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
