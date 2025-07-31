package com.ims.entity.sale;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ims.entity.customer.Customer;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @Column(name = "sale_id")
    private Long saleId;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "sale")
    @JsonIgnore
    private List<SalesItem> items ;


    public Sale() {
    }

    public Sale(Long saleId, Customer customer, LocalDateTime createdAt, List<SalesItem> items) {
        this.saleId = saleId;
        this.customer = customer;
        this.createdAt = createdAt;
        this.items = items;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<SalesItem> getItems() {
        return items;
    }

    public void setItems(List<SalesItem> items) {
        this.items = items;
    }
}