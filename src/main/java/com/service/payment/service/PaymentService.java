package com.service.payment.service;

import com.razorpay.RazorpayException;

/**
 * @author Ashwani Kumar
 * Created on 04/03/24.
 */
public interface PaymentService {

    String createPaymentLink(String orderId, float amount, String currency, String redirectUrl, String webhookUrl) throws RazorpayException;

    String getPaymentStatus(String orderId);
}
