package scut.javawebonlineshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scut.javawebonlineshop.pojo.Products;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.service.ProductsService;

@RestController
@Slf4j
@CrossOrigin
public class ProductsController {
    @Autowired
    private ProductsService productsService;
    @GetMapping("/getProducts")
    public Result getProducts(){
        return productsService.getProducts();
    }
    @PostMapping("/fetchProductsByName")
    public Result getProductsByType(@RequestBody Products products){
        Products product=productsService.fetchProductsByName(products);
        return Result.success(product);
    }
    @PostMapping("/deleteProduct")
    public Result deleteProduct(@RequestBody Products products){
        productsService.deleteProduct(products);
        return Result.success();
    }
    @PostMapping("/addProduct")
    public Result addProduct(@RequestBody Products products){
        productsService.addProduct(products);
        return Result.success();
    }
    @PostMapping("/reviseProduct")
    public Result reviseProduct(@RequestBody Products products){
        productsService.reviseProduct(products);
        return Result.success();
    }
    @PostMapping("/updateProductNum")
    public Result updateProductNum(@RequestBody Products products){
        productsService.updateProductNum(products);
        return Result.success();
    }
}
