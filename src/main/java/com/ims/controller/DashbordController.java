package com.ims.controller;

import com.ims.entity.product.Categories;
import com.ims.entity.product.Product;
import com.ims.entity.sale.Sale;
import com.ims.entity.user.User;
import com.ims.enums.Role;
import com.ims.repository.UserRepository;
import com.ims.service.DashbordService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
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

//    Fetch all users who have the role 'admin'
    @GetMapping("/getUserByRole")
    public List<User> getUsersByRole(@RequestParam Role role){
        List<User> users=dashbordService.getUsersByRole(role);
        return users;
    }
//    Retrieve all products with a quantity less than 10.
    @GetMapping("/getProductUsingQuantity")
    public List<Product> getProductByQuantity(@RequestParam Integer quantity){
       List<Product>  Product=dashbordService.getProductUsingQuantity(quantity);
       return  Product;
    }

//    Retrieve all products where the quantity is below 5 (reorder threshold). yes
    @GetMapping("/getproductNametherquantityIsLessthan5")
    public List<Object[]> getProductNameTherQuantityIsLessThan5(){
        return dashbordService.getProductTherQuantityIsLessThan5();
    }

//    Calculate the total revenue from all sales (quantity × price
    @GetMapping("/CalculateTheTotalRevenueOfAllSales")
    public Double getTotalRevenueOfSales(){
        return dashbordService.getTotalRevenueOfSales();
    }

//    Get the top 5 best-selling products by total quantity sold
    @GetMapping("/getTop5ProductThatSalesMost")
    public List<Object[]> getTop5Products(){
        return dashbordService.getTop5SalingProduct();
    }


//    Find the total quantity sold per product.
    @GetMapping("/getTotalQuantitySoldOfPerProduct")
    public  List<Object[]> getTotalQuantitySoldOfPerProduct(){
        return dashbordService.getTotalQuantitySoldOfPerProduct();
    }
    //    Get all sales created in the last 30 days
    @GetMapping("/getSalesOfProductAftertDate")
    public List<Sale> getsalesOfProduct( @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTime){
        return dashbordService.getSalesOfProductAftertDate(dateTime);
    }


    @GetMapping("/getCustomerNameAndSale")
    public List<Object[]> getCustomerNameAndSale(){
        return dashbordService.getCustomerNameAndSale();
    }
//    List each supplier and how many purchases were made from them
    @GetMapping("/getAllSupplierAndPurchese")
    public List<Object[]> getAllSupplierAndPurchese(){
        return dashbordService.getAllSupplierAndPurchese();
    }

    @GetMapping("/orderTheCategoriesInASC_Order")
    public List<Categories> GetAllCategoriesInAsc(){
        return dashbordService.getAllCategories();
    }

    @GetMapping("/getAllProductsAndThereCategoryName")
    public List<Object[]> getAllProductsAndThereCategoryName(){
        return dashbordService.getAllProductsAndThereCategoryName();
    }
    @GetMapping("/getallPurchaseOfUser")
    public List<Object[]> getallPurchaseOfUser(@RequestParam String username){
        return dashbordService.getallPurchaseOfUser(username);
    }


    @PostMapping("/findAllInformationByUserName ")
    public String getExcelSheetOfUser(@RequestParam(value = "page" ,defaultValue = "0",required = false) Integer page,
                                      @RequestParam(value = "pageSize",defaultValue = "5",required = false)Integer pagesize,
                                      @RequestParam String username ){
        return dashbordService.getExportdata(username,page,pagesize);
    }

}
