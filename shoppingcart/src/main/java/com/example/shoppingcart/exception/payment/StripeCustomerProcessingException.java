package com.example.shoppingcart.exception.payment;

import lombok.Getter;

@Getter
public class StripeCustomerProcessingException extends RuntimeException {

    private final String customerEmail;

    public StripeCustomerProcessingException(String customerEmail) {
        super(String.format("Cannot process customer with email = %s.", customerEmail));
        this.customerEmail = customerEmail;
    }
}
