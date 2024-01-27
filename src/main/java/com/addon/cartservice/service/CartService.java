package com.addon.cartservice.service;

import java.util.List;
import java.util.Optional;

import com.addon.cartservice.entity.CartEntity;

public interface CartService {

    CartEntity save(CartEntity cartEntity);    
    CartEntity update(CartEntity cartEntity);
    Optional<CartEntity> findByCartId(Long cartId);
    List<CartEntity> findByUserId(String userId);
    void deleteByCartId(Long cartId);
    void deleteByUserId(String cartId);
    List<CartEntity> get();
}
