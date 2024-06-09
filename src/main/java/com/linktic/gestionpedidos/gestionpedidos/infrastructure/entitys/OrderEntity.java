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
}
