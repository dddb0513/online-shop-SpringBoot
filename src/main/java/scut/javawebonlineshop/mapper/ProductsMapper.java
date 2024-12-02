package scut.javawebonlineshop.mapper;

import org.apache.ibatis.annotations.*;
import scut.javawebonlineshop.pojo.Products;
import scut.javawebonlineshop.pojo.Result;

import java.util.List;

@Mapper
public interface ProductsMapper {
    @Select("SELECT * FROM products")
    List<Products> getProducts();
    @Select("select * from products where pro_name = '${proName}'")
    Products fetchProductsByName(Products products);
    @Delete("delete from products where pro_name = '${proName}'")
    void deleteProduct(Products products);
    @Insert("insert into products(pro_name,pro_price,pro_descrip,pro_img,pro_num) values(#{proName},#{proPrice},#{proDescrip},#{proImg},#{proNum})")
    void addProduct(Products products);
    @Select("update products set pro_name=#{proName},pro_price = #{proPrice},pro_descrip = #{proDescrip},pro_img = #{proImg},pro_num = #{proNum} where pro_id = #{proId}")
    void reviseProduct(Products products);
    @Update("update products set pro_num = #{proNum} where pro_name = #{proName}")
    void updateProductNum(Products products);
}
