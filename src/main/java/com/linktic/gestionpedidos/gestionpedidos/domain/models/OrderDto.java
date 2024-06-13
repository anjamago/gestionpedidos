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

    public OrderDto(UUID orderId, OrderState state, List<OrdenProductDto> orderProduct, UUID userId, LocalDateTime orderDate) {
        OrderId = orderId;
        State = state;
        OrderProduct = orderProduct;
        UserId = userId;
        OrderDate = orderDate;
    }

    public BigDecimal GetTotalPrice(){
        return OrderProduct.stream().map(
                op->op.getTotalPrice()
        ).reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }

    public UUID getUserId() {
        return UserId;
    }

    public void setUserId(UUID userId) {
        UserId = userId;
    }

    public List<OrdenProductDto> getOrderProduct() {
        return OrderProduct;
    }

    public void setOrderProduct(List<OrdenProductDto> orderProduct) {
        OrderProduct = orderProduct;
    }

    public OrderState getState() {
        return State;
    }

    public void setState(OrderState state) {
        State = state;
    }
}
