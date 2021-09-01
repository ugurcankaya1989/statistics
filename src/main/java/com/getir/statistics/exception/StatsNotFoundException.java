package com.getir.statistics.exception;

import lombok.Getter;

@Getter
public class StatsNotFoundException extends RuntimeException{
    private Long customerId;

    public StatsNotFoundException(Long customerId) {
        this.customerId = customerId;
    }
}
