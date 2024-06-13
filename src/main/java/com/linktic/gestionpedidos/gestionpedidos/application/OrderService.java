package com.linktic.gestionpedidos.gestionpedidos.application;

import com.linktic.gestionpedidos.gestionpedidos.domain.mapper.OrderMapper;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderDto;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderRequestDto;
import com.linktic.gestionpedidos.gestionpedidos.infrastructure.Adapter.IOrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderService {
    @Autowired
    private IOrdenesRepository _orderRepository;

    public OrderService(IOrdenesRepository orderRepository) {
        _orderRepository = orderRepository;
    }

    public OrderDto addOrder(OrderRequestDto orderDto) {

        var data = OrderMapper.mapToEntity(orderDto);
        var entity = _orderRepository.save(data);
        return OrderMapper.mapToDto(entity);

    }

    public List<OrderDto> getAllOrders() {

        List<OrderDto> response = new ArrayList<>();
        var  orders = _orderRepository.findAll();
        var data = StreamSupport.stream(orders.spliterator(), false).collect(Collectors.toList());
        response =data.stream().map(OrderMapper::mapToDto).collect(Collectors.toList());

        return response;

    }

    public OrderDto GetOrderById(UUID orderId) {

        var order = _orderRepository.findById(orderId).orElseThrow(
                ()-> new RuntimeException("Category  with id  [%s] not found".formatted(orderId))
        );
        return  OrderMapper.mapToDto(order);
    }


}
