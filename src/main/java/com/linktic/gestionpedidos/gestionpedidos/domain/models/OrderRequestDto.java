package com.linktic.gestionpedidos.gestionpedidos.domain.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrderRequestDto(
         LocalDateTime OrderDate,
         UUID UserId,
         List<OrdenProductDto>OrderProduct,
         OrderState State
) {
}
