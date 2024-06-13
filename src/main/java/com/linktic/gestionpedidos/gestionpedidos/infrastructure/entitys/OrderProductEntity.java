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

    public OrderProductEntity(UUID id, BigDecimal quatity, UUID productId, BigDecimal price) {
        this.id = id;
        this.quatity = quatity;
        this.productId = productId;
        this.price = price;
    }

    public OrderProductEntity( BigDecimal quatity, UUID productId, BigDecimal price) {
        this.quatity = quatity;
        this.productId = productId;
        this.price = price;
    }
    public OrderProductEntity() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public BigDecimal getQuatity() {
        return quatity;
    }

    public void setQuatity(BigDecimal quatity) {
        this.quatity = quatity;
    }
}
