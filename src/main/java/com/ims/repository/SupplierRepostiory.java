package com.ims.repository;

import com.ims.entity.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface SupplierRepostiory extends JpaRepository<Supplier,Long> {
    //    List each supplier and how many purchases were made from them.
    @Query("SELECT s.supplierName, COUNT(p) FROM Purchase p JOIN p.supplier s GROUP BY s.supplierName")
    List<Object[]> findListOfSuppliersAndPurchaseCount();
}
