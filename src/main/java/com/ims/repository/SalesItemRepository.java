package com.ims.repository;

import com.ims.entity.sale.SalesItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesItemRepository extends JpaRepository<SalesItem, Long> {
//    Find the total quantity sold per product.
    @Query("select s.product.productName,s.quantity from SalesItem s group by s.product.productName ,s.quantity")
    List<Object[]> findQuantityThatSaleOfProduct();

//    Get the top 5 best-selling products by total quantity sold.
   @Query(value = """
    SELECT p.product_name, SUM(s.quantity) AS total_quantity
    FROM sales_items s
    JOIN product p ON s.product_id = p.product_id
    GROUP BY p.product_name
    ORDER BY total_quantity DESC
    LIMIT 5
     """, nativeQuery = true)
   List<Object[]> findTop5SellingProductsNative();

//    Calculate the total revenue from all sales (quantity × price)
    @Query("select sum(s.quantity*s.product.price) from SalesItem s")
   Double findTotalRevenu();

//    Retrieve all products where the quantity is below 5 (reorder threshold).
    @Query("select s.product.productName ,s.product.quantity- sum(s.quantity) from SalesItem s group by s.product.productName, s.product.quantity having s.product.quantity- sum(s.quantity)<6")
    List<Object[]> findProductWhereQuantityIsLessThan5();
}