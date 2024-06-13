package com.linktic.gestionpedidos.gestionpedidos.infrastructure.entitys;

import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrdenProductDto;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderState;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Orders",schema = "shoppingcart")
public class OrderEntity {

    public OrderEntity(UUID orderId, LocalDateTime orderDate, OrderState state, UUID userId, List<OrderProductEntity> orderProductEntities) {
        OrderId = orderId;
        OrderDate = orderDate;
        State = state;
        UserId = userId;
        this.orderProductEntities = orderProductEntities;
    }
    public OrderEntity( LocalDateTime orderDate, OrderState state, UUID userId, List<OrderProductEntity> orderProductEntities) {

        OrderDate = orderDate;
        State = state;
        UserId = userId;
        this.orderProductEntities = orderProductEntities;
    }

    public OrderEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID OrderId;
    private LocalDateTime OrderDate;
    private UUID UserId;
    @Enumerated(EnumType.STRING)
    private OrderState State;
    @CreationTimestamp
    private LocalDateTime CreateDate;
    @UpdateTimestamp
    private LocalDateTime UpdateDate;

    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.PERSIST)
    private  List<OrderProductEntity> orderProductEntities;

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

    public OrderState getState() {
        return State;
    }

    public void setState(OrderState state) {
        State = state;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        UpdateDate = updateDate;
    }

    public List<OrderProductEntity> getOrderProductEntities() {
        return orderProductEntities;
    }

    public void setOrderProductEntities(List<OrderProductEntity> orderProductEntities) {
        this.orderProductEntities = orderProductEntities;
    }
}
