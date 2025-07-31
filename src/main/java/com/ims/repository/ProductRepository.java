package com.ims.repository;

import com.ims.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    //@Query(value =" Select * from product as p inner join categories as c on p.categories_id=c.categories_id where c.categories_name=?",nativeQuery = true)
//    @Query(value = """
//    SELECT p.product_id, p.product_name, p.price, p.quantity
//    FROM product AS p
//    INNER JOIN categories AS c
//    ON p.categories_id = c.categories_id
//    WHERE c.categories_name = ?1
//    """, nativeQuery = true)
     @Query("SELECT p FROM Product p WHERE p.categories.categoriesName = :name")
    List<Product> findByCategories( String categoriesName);

}
