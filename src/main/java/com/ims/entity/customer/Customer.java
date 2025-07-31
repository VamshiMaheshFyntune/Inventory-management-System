package com.ims.entity.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ims.entity.sale.Sale;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_number")
    private String customerNumber;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Sale> sales;


    public Customer() {
    }

    public Customer(Long customerId, String customerName, String customerNumber, List<Sale> sales) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.sales = sales;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
