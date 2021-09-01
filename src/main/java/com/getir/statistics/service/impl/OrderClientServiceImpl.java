package com.getir.statistics.service.impl;

import com.getir.statistics.dto.OrderStatisticDTO;
import com.getir.statistics.service.OrderClientService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderClientServiceImpl implements OrderClientService {

    @Override
    public List<OrderStatisticDTO> getOrderStatsByCustomer(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String orderUrl = "http://order:8082/api/order-statistic//get-order-stats-by-customer/" + id;
        ParameterizedTypeReference<List<OrderStatisticDTO>> responseType = new ParameterizedTypeReference<>() {
        };
        ResponseEntity<List<OrderStatisticDTO>> responseEntity = restTemplate.exchange(orderUrl, HttpMethod.GET, null, responseType);
        return responseEntity.getBody();
    }
}
