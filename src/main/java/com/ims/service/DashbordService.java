package com.ims.service;

import com.ims.entity.product.Product;
import com.ims.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashbordService {

    private final ProductRepository productRepository;

    private final UserRepository userRepository;

    private final SaleRepository saleRepository;

    private final SalesItemRepository salesItemRepository;

    private final SupplierRepostiory supplierRepostiory;

    private final CustomerRepository customerRepository;

    private final CategoriesRepository categoriesRepository;

    public DashbordService(ProductRepository productRepository, UserRepository userRepository, SaleRepository saleRepository, SalesItemRepository salesItemRepository, SupplierRepostiory supplierRepostiory, CustomerRepository customerRepository, CategoriesRepository categoriesRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.saleRepository = saleRepository;
        this.salesItemRepository = salesItemRepository;
        this.supplierRepostiory = supplierRepostiory;
        this.customerRepository = customerRepository;
        this.categoriesRepository = categoriesRepository;
    }

    public List<Product> getProductByCategory(String categoriesName) {
       List<Product> getdata= productRepository.findByCategories(categoriesName);
        return getdata;
    }
}
