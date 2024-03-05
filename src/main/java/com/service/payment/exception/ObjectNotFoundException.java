package com.service.payment.exception;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
