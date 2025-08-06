package com.ims.repository;

import com.ims.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    @Query("SELECT c FROM Customer c")
    List<Customer> findAllCostomers();
}
