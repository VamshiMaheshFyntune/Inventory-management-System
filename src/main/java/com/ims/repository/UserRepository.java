package com.ims.repository;

import com.ims.entity.user.User;
import com.ims.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
//    Fetch all users who have the role .
    @Query("select u from User u where u.role=:role")
    List<User> findByRole(@Param("role") Role role);

//    @Query(
//            value = "select u.user_name as UserName," +
//                    "u.role as Role," +
//                    "p.product_name as ProductName," +
//                    "c.categories_name as CategoriesName," +
//                    "p.price as Price," +
//                    "sup.supplier_name as SupplierName," +
//                    "si.sales_item_id as SalesItemId," +
//                    "s.sale_id as SaleId," +
//                    "cum.customer_name as CustomerName"+
//                    "from sales_items si left join sales s on  si.sale_id = s.sale_id" +
//                    "join customers cum on s.customer_id = cum.customer_id" +
//                    "join categories c on s.customer_id = cum.customer_id" +
//                    "join product p  on si.product_id = p.product_id" +
//                    "join categories c on  p.category_id = c.categories_id" +
//                    "LEFT JOIN purchase_items pi on p.product_id = pi.product_id" +
//                    "LEFT JOIN purchases pu on pi.purchase_id = pu.purchase_id" +
//                    "LEFT JOIN suppliers sup on pu.supplier_id = sup.supplier_id" +
//                    "LEFT JOIN users u on pu.received_by = u.user_id" +
//                    "WHERE u.user_id =?",nativeQuery = true)
    @Query(
            value = "SELECT " +
                    "    u.username AS UserName," +
                    "    u.role AS Role," +
                    "    p.product_name AS ProductName," +
                    "    c.categories_name AS CategoriesName," +
                    "    p.price AS Price," +
                    "    sup.supplier_name AS SupplierName," +
                    "    si.sales_item_id AS SalesItemId," +
                    "    s.sale_id AS SaleId," +
                    "    cum.customer_name AS CustomerName " +
                    "FROM sales_items si " +
                    "JOIN sales s " +
                    "    ON si.sale_id = s.sale_id " +
                    "JOIN customers cum " +
                    "    ON s.customer_id = cum.customer_id " +
                    "JOIN product p " +
                    "    ON si.product_id = p.product_id " +
                    "JOIN categories c " +
                    "    ON p.category_id = c.categories_id " +
                    "LEFT JOIN purchase_items pi " +
                    "    ON p.product_id = pi.product_id " +
                    "LEFT JOIN purchases pu " +
                    "    ON pi.purchase_id = pu.purchase_id " +
                    "LEFT JOIN suppliers sup " +
                    "    ON pu.supplier_id = sup.supplier_id " +
                    "LEFT JOIN users u " +
                    "    ON pu.received_by = u.user_id " +
                    "WHERE u.user_id =?"
    ,nativeQuery = true)
    List<Object[]> getUserAllInfornamtion( Long userId);
}
