package com.addon.cartservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addon.cartservice.entity.CartEntity;
import com.addon.cartservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping()
    public CartEntity save(@RequestBody CartEntity userEntiy) {
        return cartService.save(userEntiy);
    }

    @GetMapping()
    public List<CartEntity> get() {
        return cartService.get();
    }

    @GetMapping("/{id}")
    public CartEntity getByCartId(@PathVariable(name = "id") Long cartId) {
        Optional<CartEntity> byId = cartService.findByCartId(cartId);
        return byId.isPresent() ? byId.get() : null;
    }

    @GetMapping("user/{userId}")
    public List<CartEntity> getByUserId(@PathVariable(name = "userId") String userId) {
        return cartService.findByUserId(userId);
    }

    @PutMapping()
    public void update(@RequestBody CartEntity cartEntity) {
        cartService.update(cartEntity);
    }

    @DeleteMapping("user/{userId}")
    public void delete(@PathVariable(name = "userId") String userId) {
        cartService.deleteByUserId(userId);
    }

    @DeleteMapping("/{cartId}")
    public void delete(@PathVariable(name = "cartId") Long cartId) {
        cartService.deleteByCartId(cartId);
    }

}
