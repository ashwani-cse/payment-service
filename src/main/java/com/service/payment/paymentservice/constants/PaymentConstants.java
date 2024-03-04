package com.service.payment.paymentservice.constants;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */
public final class PaymentConstants {

    public interface ApiSecurity {

        String PATH = "api/v1";
        String INVALID_API_KEY = "Invalid API key";
        String X_API_KEY = "x-api-key";
        String KEY = "${api.key}";
    }
}
