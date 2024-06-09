package com.linktic.gestionpedidos.gestionpedidos.domain.models;

import java.math.BigDecimal;
import java.util.UUID;

public class OrdenProductDto{

    public UUID id;
    public BigDecimal price;
    public UUID productId;
    public BigDecimal quatity;

    public BigDecimal getTotalPrice() {
        return price.multiply(quatity);
    }
}
