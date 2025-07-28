package com.ims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @Column(name = "c_id")
    private Long cId;

    @Column(name = "c_name")
    private String cName;

    public Categories() {
    }

    public Categories(Long cId, String cName) {
        this.cId = cId;
        this.cName = cName;
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
}
