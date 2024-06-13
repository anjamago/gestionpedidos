package com.linktic.gestionpedidos.gestionpedidos.infrastructure.Api;


import com.linktic.gestionpedidos.gestionpedidos.application.OrderService;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderDto;
import com.linktic.gestionpedidos.gestionpedidos.domain.models.OrderRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdenesController {
    private  final OrderService _orderService;

    public OrdenesController(OrderService orderService) {
        _orderService = orderService;
    }


    @PostMapping()
    public OrderDto CreateOrder(@RequestBody OrderRequestDto orderDto) {
        return _orderService.addOrder(orderDto);
    }

    @GetMapping()
    public List<OrderDto> GetAllOrders() {
        return  _orderService.getAllOrders();
    }
}
