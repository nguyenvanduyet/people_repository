package com.module4.model;

import javax.persistence.*;

@Entity
public class People {
    @Id
    private  int id;
    private String name;
    private String address;

    @ManyToOne
    private Detail detail;

    public People() {
    }

    public People(int id, String name, String address, Detail detail) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.detail = detail;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}
