package com.ims.repository;

import com.ims.entity.purchase.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem,Long> {
}
