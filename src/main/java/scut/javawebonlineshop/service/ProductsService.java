package scut.javawebonlineshop.service;


import scut.javawebonlineshop.pojo.Products;
import scut.javawebonlineshop.pojo.Result;

public interface ProductsService {

    Result getProducts();

    Products fetchProductsByName(Products products);

    void deleteProduct(Products products);

    void addProduct(Products products);

    void reviseProduct(Products products);

    void updateProductNum(Products products);
}
