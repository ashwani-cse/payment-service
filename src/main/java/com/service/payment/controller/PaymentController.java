package com.service.payment.controller;

import com.razorpay.RazorpayException;
import com.service.payment.constants.PaymentConstants;
import com.service.payment.dto.PaymentLinkDto;
import com.service.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

@Slf4j
@RequestMapping(PaymentConstants.ApiSecurity.PATH + "/payments")
@RestController
public class PaymentController {

    private final PaymentService razorpayService;

    public PaymentController(PaymentService razorpayService) {
        this.razorpayService = razorpayService;
    }

    @GetMapping("/test")
    public String home() {
        return "Payment Service UP and Running!";
    }

    @GetMapping("/")
    public String createPaymentLink(@RequestBody PaymentLinkDto paymentLinkDto) throws RazorpayException {
        String paymentLink = razorpayService.createPaymentLink(paymentLinkDto.orderId(), paymentLinkDto.amount(), paymentLinkDto.currency(), paymentLinkDto.callbackUrl(), paymentLinkDto.webhookUrl());
        return paymentLink;
    }

    /**
     * For webhook configuration we are using localtunnel because we are running our application on local machine.
     * So, we need to expose our local server to the internet. If we don't expose our local server to the internet
     * then we will not be able to receive the webhook from Razorpay. Therefore, we need to install localtunnel using npm.
     * Steps:
     * 1. Install localtunnel using below command:
     *         npm install -g localtunnel
     * 2. Run localtunnel using below command:
     *        lt --port 8083              // 8083 is the port on which our application is running where we want webhook events
     *                                   // from razorpay to be received on this port.
     *    Note: after running above command, we will get a url which we need to configure in the razorpay dashboard like:
     *          https://shaggy-planets-rule.loca.lt (this is just an example) and then we need to configure this url in the
     *          razorpay dashboard in the webhook section.
     * 3. Go to the razorpay dashboard and click on Add New Webhook.
     * 4. Enter url https://shaggy-planets-rule.loca.lt/api/v1/payments/webhook
     * 5. Enter secret key (it is optional but recommended to use)
     * 6. Add Active Events like payment_link.paid, payment_link.partially_paid, payment.dispute.created,  etc
     * 7. Click on Save
     * 8. Now, we are ready to receive the webhook events from razorpay.
     */
    @PostMapping("/webhook")
    public String paymentWebhook(@RequestBody String payload) {
        log.info("Payment Webhook Received: {}", payload);
        return "Payment Webhook Received!";
    }


}
