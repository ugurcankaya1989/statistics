package com.getir.statistics.service.impl;

import com.getir.statistics.dto.OrderStatisticDTO;
import com.getir.statistics.exception.StatsNotFoundException;
import com.getir.statistics.service.OrderClientService;
import com.getir.statistics.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatisticServiceImpl implements StatisticService {

    private final OrderClientService orderClientService;

    public List<OrderStatisticDTO> getOrderStatsByCustomer(Long customerId){
        List<OrderStatisticDTO> orderStatisticDTOList = orderClientService.getOrderStatsByCustomer(customerId);
        if(CollectionUtils.isEmpty(orderStatisticDTOList))
            throw new StatsNotFoundException(customerId);
        return orderStatisticDTOList;
    }

}
