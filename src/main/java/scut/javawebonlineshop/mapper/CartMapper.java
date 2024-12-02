package scut.javawebonlineshop.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import scut.javawebonlineshop.pojo.Cart;
import scut.javawebonlineshop.pojo.Result;

import java.util.List;

@Mapper
public interface CartMapper {
    @Insert("insert into cart(pro_id,cart_pro_num,user_name,cart_pro_img,pro_name) values(#{proId},#{cartProNum},#{userName},#{cartProImg},#{proName})")
    public void addToCart(Cart cart);

    @Select("select * from cart where user_name=#{userName}")
    public List<Cart> fetchCartItems(Cart cart);

    @Delete("delete from cart where pro_name=#{proName}")
    void removeFromCart(Cart cart);
    @Select("select * from cart where pro_name=#{proName}")
    public List<Cart> inquireCart(Cart cart);

    @Delete("delete from cart where user_name=#{userName}")
    public void deleteUserInCart(Cart cart);
}
