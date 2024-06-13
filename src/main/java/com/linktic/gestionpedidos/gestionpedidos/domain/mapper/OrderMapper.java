package com.linktic.gestionpedidos.gestionpedidos.domain.mapper;

import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrdenProductDto;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderDto;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderRequestDto;
import com.linktic.gestionpedidos.gestionpedidos.infrastructure.entitys.OrderEntity;
import com.linktic.gestionpedidos.gestionpedidos.infrastructure.entitys.OrderProductEntity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class OrderMapper {

    public static OrderEntity mapToEntity(OrderRequestDto entity) {
        return new OrderEntity(
            entity.OrderDate(),
                entity.State(),
                entity.UserId(),
               OrderMapper.mapToEntityList(entity.OrderProduct())
        );
    }
    public static OrderDto mapToDto(OrderEntity entity) {
        return new OrderDto(
                entity.getOrderId(),
                entity.getState(),
                OrderMapper.mapToDtoListDto(entity.getOrderProductEntities()),
                entity.getUserId(),
                entity.getOrderDate()
        );
    }

    public static OrderProductEntity mapToProducEntity(OrdenProductDto entity) {
        return new OrderProductEntity(
                entity.getQuatity(),
                entity.getProductId(),
                entity.getPrice()
        );
    }

    public static OrdenProductDto mapToProducDto(OrderProductEntity entity) {
        return new OrdenProductDto(
                entity.getId(),
                entity.getQuatity(),
                entity.getProductId(),
                entity.getPrice()
        );
    }

    public static List<OrderProductEntity> mapToEntityList(Iterable<OrdenProductDto> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(OrderMapper::mapToProducEntity)
                .collect(Collectors.toList());
    }
    public static List<OrdenProductDto> mapToDtoListDto(Iterable<OrderProductEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(OrderMapper::mapToProducDto)
                .collect(Collectors.toList());
    }

}
