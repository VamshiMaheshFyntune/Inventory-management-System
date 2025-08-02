package com.ims.repository;

import com.ims.entity.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
//    List all purchases made by a specific user (use a parameter for user ID).
    @Query("select p.purchaseId,p.receivedBy.username from Purchase p where p.receivedBy.username=:username")
    List<Object[]> findPurchaseByUser(@Param("username") String username);

    //    List each supplier and how many purchases were made from them.
    @Query("SELECT s.supplierName, COUNT(p) FROM Purchase p JOIN p.supplier s GROUP BY s.supplierName")
    List<Objects[]> findListOfSuplierAndPurchasesMaedFromThem();



}
