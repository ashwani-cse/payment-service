package com.service.payment.exception;

import com.razorpay.RazorpayException;
import com.service.payment.dto.ErrorPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */
@Slf4j
@RestControllerAdvice
public class PaymentControllerAdvice {

    @ExceptionHandler(RazorpayException.class)
    public ResponseEntity<ErrorPayload> handleRazorpayException(RazorpayException e) {
        log.error("RazorpayException: ", e);
        return ErrorResponse.handlerException(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

}
