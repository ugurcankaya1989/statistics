package com.getir.statistics.controller;

import com.getir.statistics.dto.OrderStatisticDTO;
import com.getir.statistics.service.OrderClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statistics")
@RequiredArgsConstructor
public class StatisticController {
    private final OrderClientService orderClientService;

    @GetMapping("/order-stats-by-customer-id/{customerId}")
    public ResponseEntity<List<OrderStatisticDTO>> getOrderStatsByCustomer(@PathVariable("customerId") Long customerId) {
        return ResponseEntity.ok(orderClientService.getOrderStatsByCustomer(customerId));
    }
}
