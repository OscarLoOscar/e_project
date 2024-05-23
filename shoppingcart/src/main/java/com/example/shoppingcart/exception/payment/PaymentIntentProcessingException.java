package com.example.shoppingcart.exception.payment;

import lombok.Getter;

@Getter
public class PaymentIntentProcessingException extends RuntimeException{

    private final String paymentMethodId;

    public PaymentIntentProcessingException(String paymentMethodId) {
        super(String.format("Payment intent with the paymentMethodId = '%s' cannot be processed.", paymentMethodId));
        this.paymentMethodId = paymentMethodId;
    }
}
