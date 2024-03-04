package com.service.payment.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.service.payment.paymentservice.constants.PaymentConstants.ApiSecurity.PATH;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

@RequestMapping(PATH + "/payments")
@RestController
public class PaymentController {

    @GetMapping("/test")
    public String home() {
        return "Payment Service UP and Running!";
    }


}
