package com.ims.repository;

import com.ims.entity.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {

    @Query("select p.purchaseId,p.receivedBy.username from Purchase p group by p.receivedBy.username")
    List<Objects[]> findPurchaseByUser();
}
