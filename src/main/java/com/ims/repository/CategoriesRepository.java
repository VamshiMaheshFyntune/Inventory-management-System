package com.ims.repository;

import com.ims.entity.product.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {

    @Query("select c from Categories c order by ASC")
    List<Categories> getcategoriesByInASC();
}
