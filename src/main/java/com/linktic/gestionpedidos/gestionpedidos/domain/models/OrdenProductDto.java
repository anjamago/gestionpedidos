package com.linktic.gestionpedidos.gestionpedidos.domain.models;

import java.math.BigDecimal;
import java.util.UUID;

public class OrdenProductDto{

    public UUID id;
    public BigDecimal price;
    public UUID productId;
    public BigDecimal quatity;

    public OrdenProductDto(UUID id, BigDecimal price, UUID productId, BigDecimal quatity) {
        this.id = id;
        this.price = price;
        this.productId = productId;
        this.quatity = quatity;
    }

    public OrdenProductDto( BigDecimal price, UUID productId, BigDecimal quatity) {
        this.price = price;
        this.productId = productId;
        this.quatity = quatity;
    }
    public OrdenProductDto() {}

    public BigDecimal getTotalPrice() {
        return price.multiply(quatity);
    }

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
