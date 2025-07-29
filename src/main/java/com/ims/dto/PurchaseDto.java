package com.ims.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDto {
    private Long purchaseId;
    private BigDecimal totalAmount;
    private Long supplierId;
    private Long receivedById;
    private LocalDateTime createdAt;
    private List<PurchaseItemDto> items;

    public PurchaseDto() {
    }

    public PurchaseDto(Long purchaseId, BigDecimal totalAmount, Long supplierId, Long receivedById, LocalDateTime createdAt, List<PurchaseItemDto> items) {
        this.purchaseId = purchaseId;
        this.totalAmount = totalAmount;
        this.supplierId = supplierId;
        this.receivedById = receivedById;
        this.createdAt = createdAt;
        this.items = items;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getReceivedById() {
        return receivedById;
    }

    public void setReceivedById(Long receivedById) {
        this.receivedById = receivedById;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<PurchaseItemDto> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItemDto> items) {
        this.items = items;
    }
}
