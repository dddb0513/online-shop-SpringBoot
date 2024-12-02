package scut.javawebonlineshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scut.javawebonlineshop.pojo.Cart;
import scut.javawebonlineshop.pojo.Result;
import scut.javawebonlineshop.service.CartService;

@RestController
@Slf4j
@CrossOrigin
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    public Result addToCart(@RequestBody Cart cart){
        cartService.addToCart(cart);
        return Result.success();
    }

    @PostMapping("/fetchCartItems")
    public Result fetchCartItems(@RequestBody Cart cart){
        return Result.success(cartService.fetchCartItems(cart));
    }

    @PostMapping("/removeFromCart")
    public Result removeFromCart(@RequestBody Cart cart){
        cartService.removeFromCart(cart);
        return Result.success();
    }
    @PostMapping("/inquireCart")
    public Result inquireCart(@RequestBody Cart cart){
        if(cartService.inquireCart(cart)){
            return Result.error("商品已存在");
        }
        return Result.success();
    }

    @PostMapping("/deleteUserInCart")
    public Result deleteUserInCart(@RequestBody Cart cart){
        cartService.deleteUserInCart(cart);
        return Result.success();
    }



}
