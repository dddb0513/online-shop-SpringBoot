package scut.javawebonlineshop.service.imp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.javawebonlineshop.mapper.CartMapper;
import scut.javawebonlineshop.pojo.Cart;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.service.CartService;

import java.util.List;

@Service
@Slf4j
public class CartServiceImp implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public void addToCart(Cart cart) {
        cartMapper.addToCart(cart);
    }

    @Override
    public List<Cart> fetchCartItems(Cart cart) {
        return cartMapper.fetchCartItems(cart);
    }
    @Override
    public Result removeFromCart(Cart cart) {
        cartMapper.removeFromCart(cart);
        return Result.success();
    }
    @Override
    public boolean inquireCart(Cart cart) {
        List<Cart> cartList =cartMapper.inquireCart(cart);
        if(cartList.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteUserInCart(Cart cart) {
        cartMapper.deleteUserInCart(cart);
    }
}
