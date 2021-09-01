package com.getir.statistics.exception;

import com.getir.statistics.constant.ErrorConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(StatsNotFoundException.class)
    public ResponseEntity<ExceptionResponse> statsNotFoundException(StatsNotFoundException ex) {
        return new ResponseEntity<>(ExceptionResponse.builder().dateTime(LocalDateTime.now()).errorCode(ErrorConstants.STATS_NOT_FOUND.getErrorCode()).errorMessage(ErrorConstants.STATS_NOT_FOUND.getDescription() + ex.getCustomerId()).build(), HttpStatus.NOT_FOUND);
    }
}
