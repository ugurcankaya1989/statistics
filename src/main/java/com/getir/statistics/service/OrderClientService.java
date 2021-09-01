package com.getir.statistics.service;

import com.getir.statistics.dto.OrderStatisticDTO;

import java.util.List;

public interface OrderClientService {
    List<OrderStatisticDTO> getOrderStatsByCustomer(Long id);
}
