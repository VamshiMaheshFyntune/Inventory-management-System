package com.ims.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class SaleDto {
    private Long id;
    private BigDecimal totalAmount;
    private Long customerId;
    private Long createdById;
    private LocalDateTime createdAt;
    private List<SaleItemDto> items;

    public SaleDto() {
    }

    public SaleDto(Long id, BigDecimal totalAmount, Long customerId, Long createdById, LocalDateTime createdAt, List<SaleItemDto> items) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.customerId = customerId;
        this.createdById = createdById;
        this.createdAt = createdAt;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<SaleItemDto> getItems() {
        return items;
    }

    public void setItems(List<SaleItemDto> items) {
        this.items = items;
    }
}
