package com.ims.dto;

import java.math.BigDecimal;

public class ProductDto {
    private Long id;
    private String name;
    private String sku;
    private Integer quantity;
    private BigDecimal price;
    private Long categoryId;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String sku, Integer quantity, BigDecimal price, Long categoryId) {
        this.id = id;
        this.name = name;
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
