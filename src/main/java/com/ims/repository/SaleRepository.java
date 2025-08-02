package com.ims.repository;

import com.ims.entity.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
//    Find all sales and their corresponding customer names
    @Query("select s ,s.customer.customerName from Sale s")
    List<Object[]> findSaleAndCustomerName();

//    Get all sales created in the last 30 days
    @Query("select s from Sale s where s.createdAt>:date")
    List<Sale> findLast30DaysSales(@Param("date") LocalDateTime dateTime);
}
