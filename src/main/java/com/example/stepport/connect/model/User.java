package com.example.stepport.connect.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private long id;
    @Column(columnDefinition="name")
    private String name;

    public User(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
