package com.project.carstore.cart;

import com.project.carstore.product.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart/")
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("/addCartItem")
    public Cart addCartItemToCart(@RequestBody CartItemDTO cartItemDTO)throws ProductException
    {
        return this.cartService.addCartItemToCart(cartItemDTO);
    }
}