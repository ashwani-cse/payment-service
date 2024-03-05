package com.service.payment.dto;

import lombok.Data;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */
@Data
public class ErrorPayload {

    private int statusCode;
    private String message;

}
