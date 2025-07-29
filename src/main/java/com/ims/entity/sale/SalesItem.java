package com.ims.entity.sale;

import com.ims.entity.product.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "sales_items")
public class SalesItem {

    @Id
    @Column(name = "sales_item_id")
    private Long salesItemId;

    @ManyToOne()
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private Integer quantity;

    public SalesItem() {
    }

    public SalesItem(Long salesItemId, Sale sale, Product product, Integer quantity) {
        this.salesItemId = salesItemId;
        this.sale = sale;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(Long salesItemId) {
        this.salesItemId = salesItemId;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProductId() {
        return product;
    }

    public void setProductId(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
