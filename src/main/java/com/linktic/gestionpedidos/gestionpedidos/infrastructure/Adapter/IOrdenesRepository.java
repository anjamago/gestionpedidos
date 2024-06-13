package com.linktic.gestionpedidos.gestionpedidos.infrastructure.Adapter;

import com.linktic.gestionpedidos.gestionpedidos.infrastructure.entitys.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IOrdenesRepository extends CrudRepository<OrderEntity, UUID> {
}
