package scut.javawebonlineshop.service;

import scut.javawebonlineshop.pojo.Cart;
import scut.javawebonlineshop.pojo.Result;

import java.util.List;

public interface CartService {
    void addToCart(Cart cart);

    List<Cart> fetchCartItems(Cart cart);

    Result removeFromCart(Cart cart);

    boolean inquireCart(Cart cart);

    void deleteUserInCart(Cart cart);
}
