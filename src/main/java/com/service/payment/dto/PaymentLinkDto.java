package com.service.payment.dto;

/**
 * @author Ashwani Kumar
 * Created on 04/03/24.
 */
public record PaymentLinkDto(String orderId, float amount, String currency, String callbackUrl, String webhookUrl) {
}
