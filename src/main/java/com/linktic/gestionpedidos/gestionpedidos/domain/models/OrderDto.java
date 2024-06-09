package com.linktic.gestionpedidos.gestionpedidos.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderDto {
    private UUID OrderId;
    private LocalDateTime OrderDate;
    private UUID UserId;
    private List<OrdenProductDto> OrderProduct;
    private OrderState State;

    public OrderDto(){
        OrderProduct = new ArrayList<>();
    }

    public BigDecimal GetTotalPrice(){
        return OrderProduct.stream().map(
                op->op.getTotalPrice()
        ).reduce(BigDecimal.ZERO,BigDecimal::add);
    }

}
