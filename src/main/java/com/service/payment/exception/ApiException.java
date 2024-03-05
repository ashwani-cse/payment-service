package com.service.payment.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

@Getter
@Setter
public class ApiException extends RuntimeException {
    private int code;

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ApiException(String message, int code) {
        super(message);
        this.code = code;
    }
}
