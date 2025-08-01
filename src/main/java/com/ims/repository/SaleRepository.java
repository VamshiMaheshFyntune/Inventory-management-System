package com.ims.repository;

import com.ims.entity.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("select s ,s.customer.customerName from Sale s")
    List<Objects[]> findSaleAndCustomerName();
}
