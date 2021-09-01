package com.getir.statistics.constant;

public enum ErrorConstants {
    STATS_NOT_FOUND("10","There is no statistic for customerId : ");
    private String errorCode;
    private String description;

    ErrorConstants(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
