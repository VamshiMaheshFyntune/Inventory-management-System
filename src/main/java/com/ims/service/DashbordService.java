package com.ims.service;

import com.ims.entity.product.Categories;
import com.ims.entity.product.Product;
import com.ims.entity.sale.Sale;
import com.ims.entity.user.User;
import com.ims.enums.Role;
import com.ims.repository.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class DashbordService {

    private final ProductRepository productRepository;

    private final UserRepository userRepository;

    private final SaleRepository saleRepository;

    private final SalesItemRepository salesItemRepository;

    private final SupplierRepostiory supplierRepostiory;

    private final CustomerRepository customerRepository;

    private final CategoriesRepository categoriesRepository;

    private final PurchaseRepository purchaseRepository;

    private final  PurchaseItemRepository purchaseItemRepository;

    public DashbordService(ProductRepository productRepository, UserRepository userRepository, SaleRepository saleRepository, SalesItemRepository salesItemRepository, SupplierRepostiory supplierRepostiory, CustomerRepository customerRepository, CategoriesRepository categoriesRepository, PurchaseRepository purchaseRepository, PurchaseItemRepository purchaseItemRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.saleRepository = saleRepository;
        this.salesItemRepository = salesItemRepository;
        this.supplierRepostiory = supplierRepostiory;
        this.customerRepository = customerRepository;
        this.categoriesRepository = categoriesRepository;
        this.purchaseRepository = purchaseRepository;
        this.purchaseItemRepository = purchaseItemRepository;
    }

    public List<Product> getProductByCategory(String categoriesName) {
       List<Product> getdata= productRepository.findBycategories(categoriesName);
        return getdata;

    }

    public List<User> getUsersByRole(Role role) {
        List<User> users=userRepository.findByRole(role);
        return users;
    }

    public List<Product> getProductUsingQuantity(Integer quantity) {
        List<Product> Product=productRepository.findByQuantity(quantity);
        return Product;
    }

    public List<Object[]> getProductTherQuantityIsLessThan5() {
        return salesItemRepository.findProductWhereQuantityIsLessThan5();
    }

    public Double getTotalRevenueOfSales() {
        return salesItemRepository.findTotalRevenu();
    }

    public List<Object[]> getTop5SalingProduct() {
        return salesItemRepository.findTop5SellingProductsNative();
    }

    public List<Object[]> getTotalQuantitySoldOfPerProduct() {
        return salesItemRepository.findQuantityThatSaleOfProduct();
    }


    public List<Sale> getSalesOfProductAftertDate(LocalDateTime dateTime) {
        LocalDateTime thirtyDaysAgo = LocalDateTime.now().minusDays(30);
        return saleRepository.findLast30DaysSales(thirtyDaysAgo);
    }


    public List<Object[]> getCustomerNameAndSale() {
        return saleRepository.findSaleAndCustomerName();
    }


    public List<Object[]> getAllSupplierAndPurchese() {
        return supplierRepostiory.findListOfSuppliersAndPurchaseCount();

    }


    public List<Categories> getAllCategories() {
    return categoriesRepository.getcategoriesByInASC();
    }

    public List<Object[]> getAllProductsAndThereCategoryName() {
        return productRepository.findAllProductNameAndCategoriesName();
    }


    public List<Object[]> getallPurchaseOfUser(String username) {
        return purchaseRepository.findPurchaseByUser(username);
    }

    public String getExportdata(String username, Integer page, Integer pagesize) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new IllegalArgumentException("user is not present"));
        Long userId=user.getId();
        List<Object[]> userAllInfornamtion = userRepository.getUserAllInfornamtion(userId);
        System.out.println(userAllInfornamtion);

       return null;
    }
}
