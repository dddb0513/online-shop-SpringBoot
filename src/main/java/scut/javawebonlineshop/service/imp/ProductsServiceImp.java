package scut.javawebonlineshop.service.imp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.javawebonlineshop.mapper.ProductsMapper;
import scut.javawebonlineshop.pojo.Products;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.service.ProductsService;

import java.util.List;

@Service
@Slf4j
public class ProductsServiceImp implements ProductsService {
    @Autowired
    private ProductsMapper productsMapper;
    @Override
    public Result getProducts() {
        List<Products> products = productsMapper.getProducts();
        return Result.success(products);
    }
    @Override
    public Products fetchProductsByName(Products products) {
        Products product=new Products();
        product=productsMapper.fetchProductsByName(products);
        return product;
    }
    @Override
    public void deleteProduct(Products products){
        productsMapper.deleteProduct(products);
    }
    @Override
    public void addProduct(Products products){
        productsMapper.addProduct(products);
    }
    @Override
    public void reviseProduct(Products products){
        productsMapper.reviseProduct(products);
    }
    @Override
    public void updateProductNum(Products products){
        productsMapper.updateProductNum(products);
    }

}
