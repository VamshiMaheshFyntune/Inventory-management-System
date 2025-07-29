package com.ims.repository;

import com.ims.entity.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepostiory extends JpaRepository<Supplier,Long> {
}
