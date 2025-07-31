package com.ims.controller;

import com.ims.entity.product.Product;
import com.ims.repository.UserRepository;
import com.ims.service.DashbordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashbord")
public class DashbordController {

    private final DashbordService dashbordService;

    public DashbordController(DashbordService dashbordService) {
        this.dashbordService = dashbordService;
    }

    @GetMapping("/getproduct")
    public List<Product> getProductByCategory (@RequestParam String categoriesName ){
       List<Product>  allProduct=dashbordService.getProductByCategory(categoriesName);
       return allProduct;
    }
}
