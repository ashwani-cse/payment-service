package com.service.payment.service.impl;

import com.service.payment.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author Ashwani Kumar
 * Created on 04/03/24.
 */
@Service("stripeService")
public class StripePaymentService implements PaymentService {

        @Override
        public String createPaymentLink(String orderId, float amount, String currency, String redirectUrl, String webhookUrl) {
            return null;
        }

        @Override
        public String getPaymentStatus(String orderId) {
            return null;
        }
}
