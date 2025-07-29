package com.ims.entity.product;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @Column(name = "categories_id")
    private Long categoriesId;

    @Column(name = "categories_name")
    private String categoriesName;

    @OneToMany(mappedBy = "categories")
    private List<Product> products;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Categories() {
    }

    public Categories(Long categoriesId, String categoriesName, List<Product> products, String description, LocalDateTime createdAt) {
        this.categoriesId = categoriesId;
        this.categoriesName = categoriesName;
        this.products = products;
        this.description = description;
        this.createdAt = createdAt;
    }

    public Long getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Long categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
