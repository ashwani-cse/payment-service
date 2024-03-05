package com.service.payment.service.impl;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.service.payment.service.PaymentService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * @author Ashwani Kumar
 * Created on 04/03/24.
 */

@Service("razorpayService")
public class RazorpayPaymentService implements PaymentService {

    private final RazorpayClient razorpayClient;

    public RazorpayPaymentService(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }

    @Override
    public String createPaymentLink(String orderId, float amount, String currency, String callbackUrl, String webhookUrl) throws RazorpayException {
        JSONObject paymentLinkRequest = new JSONObject();
        paymentLinkRequest.put("amount", amount); // it is multiplier of 100 i.e. 1000 means 10.00 or 9999 means 99.99
        paymentLinkRequest.put("currency", currency);
        paymentLinkRequest.put("accept_partial", false); // if partial payment is allowed
        paymentLinkRequest.put("first_min_partial_amount", 100); // minimum amount to be paid in first payment
        paymentLinkRequest.put("expire_by", System.currentTimeMillis()+15*60*1000); // 15 minutes from now in seconds
        paymentLinkRequest.put("reference_id", orderId);
        paymentLinkRequest.put("description", "Payment for order no #" + orderId);

        // customer details for payment link from orderservice api call;
        JSONObject customer = new JSONObject();
        customer.put("name","+919996203771");
        customer.put("contact","Ashwani Kumar");
        customer.put("email","ashwanicse@outlook.com");
        paymentLinkRequest.put("customer", customer);

        JSONObject notify = new JSONObject();
        notify.put("sms", true);
        notify.put("email", true);
        paymentLinkRequest.put("reminder_enable", true);

        JSONObject notes = new JSONObject();
        notes.put("Order Details", "Iphone 13 Pro Max 256GB");
        paymentLinkRequest.put("notes", notes);

        paymentLinkRequest.put("callback_url", callbackUrl);
        paymentLinkRequest.put("callback_method", "get");

        PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);
        return payment.get("short_url");
    }

    @Override
    public String getPaymentStatus(String orderId) {
        return null;
    }
}