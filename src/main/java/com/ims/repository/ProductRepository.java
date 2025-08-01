package com.ims.repository;

import com.ims.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


// @Query(value ="Select p.product_id,p.product_name,p.category_id,p.price,p.sku,p.quantity,p.created_at,p.updated_at from product p inner join categories c on p.category_id=c.categories_id where c.categories_name=?1",nativeQuery = true)

    @Query("SELECT p FROM Product p WHERE p.categories.categoriesName = :name")
    List<Product> findBycategories( String categoriesName);

    @Query("select p from Product p where quantity<:qua")
    List<Product> findByQuantity(@Param("qua") Integer quantity);

//    @Query("select p.productName,c.categories_name from Product p left join Categories c ")
    @Query(value = "select product.product_name,categories_name from product left join categories",nativeQuery = true)
    List<Object[]> findAllProductNameAndCategoriesName();

    @Query("select p.categories.categoriesName,count(p) from Product p  group by categories.categoriesName")
    List<String> findAllCategoriesAndCountOfProduct();




}
