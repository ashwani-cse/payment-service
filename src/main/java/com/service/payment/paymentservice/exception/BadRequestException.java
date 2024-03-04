package com.service.payment.paymentservice.exception;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}
