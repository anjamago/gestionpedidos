package com.linktic.gestionpedidos.gestionpedidos.infrastructure.entitys;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;


@Entity
@Table(name = "order_products",schema = "shoppingcart")
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;
    public BigDecimal price;
    public UUID productId;
    public BigDecimal quatity;

    @ManyToOne
    private  OrderEntity orderEntity;
}
