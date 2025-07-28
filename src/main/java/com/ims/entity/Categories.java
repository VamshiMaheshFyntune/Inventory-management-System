package com.ims.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @Column(name = "c_id")
    private Long cId;

    @Column(name = "c_name")
    private String cName;

    @OneToMany(mappedBy = "categories")
    private List<Product> products;

    public Categories() {
    }

    public Categories(Long cId, String cName, List<Product> products) {
        this.cId = cId;
        this.cName = cName;
        this.products = products;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    //hello
}
