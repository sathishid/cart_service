package com.addon.cartservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addon.cartservice.entity.CartEntity;
import com.addon.cartservice.repository.CartRepository;

import jakarta.transaction.Transactional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;
    private Optional<CartEntity> byCartId;

    @Override
    public CartEntity save(CartEntity cartEntity) {
        return cartRepository.save(cartEntity);
    }

    @Override
    public CartEntity update(CartEntity cartEntity) {
        return cartRepository.save(cartEntity);
    }

    @Override
    public Optional<CartEntity> findByCartId(Long cartId) {
        return cartRepository.findByCartId(cartId);
    }

    @Override
    public List<CartEntity> findByUserId(String userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    @Transactional
    public void deleteByCartId(Long cartId) {
        cartRepository.deleteByCartId(cartId);
    }

    @Override
    @Transactional
    public void deleteByUserId(String cartId) {
        cartRepository.deleteByUserId(cartId);
    }

    @Override
    public List<CartEntity> get() {
        return cartRepository.findAll();
    }

}
