package com.ims.repository;

import com.ims.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


//    @Query(value =" Select * from product as p inner join categories as c "+
//   " on p.categories_id=c.categories_id"+
//    "where c.categories_name=?",nativeQuery = true)
//    @Query(value = "SELECT * " +
//            "FROM product AS p " +
//            "INNER JOIN categories AS c " +
//            "ON p.categories_id = c.categories_id " +  // <-- Note space after this line
//            "WHERE c.categories_name = ?",nativeQuery = true)
//    @Query("select p from product p inner join categories c on p.categories_id = c.categories_id where c.categories_name =:name")
    List<Product> findByCategories(String categoriesName);

}
