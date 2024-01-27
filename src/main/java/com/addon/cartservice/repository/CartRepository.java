package com.addon.cartservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addon.cartservice.entity.CartEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<CartEntity,Long>
{
    Optional<CartEntity> findByCartId(Long id);
    List<CartEntity> findByUserId(String userId);
    void deleteByCartId(Long cartId);
    void deleteByUserId(String cartId);

}
