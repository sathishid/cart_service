package com.addon.cartservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "AL_TR_CART")
public class CartEntity {
    @Id
    @Column(name="cart_id")
    @SequenceGenerator(name = "CART_SEQ", sequenceName = "AL_CART_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CART_SEQ")
    private Long cartId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_qnty")
    private int productQuantity;
    @Column(name="user_id")
    private String userId;
}
