package com.joy.holin.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private Long memberId;
    private Integer totalPrice;
    private String status;
    private LocalDateTime createdAt;

    private List<OrderItemDto> orderItems;
}
