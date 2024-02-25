package com.example.javaapi.entities;

public class Pupil {
    public int id;
    public String name;

    public Pupil(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
