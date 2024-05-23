package com.example.shoppingcart.exception.payment.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.shoppingcart.exception.dto.ApiErrorResponse;
import com.example.shoppingcart.exception.handler.ApiErrorResponseCreator;
import com.example.shoppingcart.exception.handler.ErrorDebugMessageCreator;
import com.example.shoppingcart.exception.payment.CardTokenCreationException;
import com.example.shoppingcart.exception.payment.CardTokenRetrievingException;
import com.example.shoppingcart.exception.payment.CustomerRetrievingException;
import com.example.shoppingcart.exception.payment.PaymentEventParsingException;
import com.example.shoppingcart.exception.payment.PaymentEventProcessingException;
import com.example.shoppingcart.exception.payment.PaymentIntentProcessingException;
import com.example.shoppingcart.exception.payment.PaymentMethodNotFoundException;
import com.example.shoppingcart.exception.payment.PaymentMethodProcessingException;
import com.example.shoppingcart.exception.payment.PaymentMethodRetrievingException;
import com.example.shoppingcart.exception.payment.PaymentNotFoundException;
import com.example.shoppingcart.exception.payment.ShoppingCartAlreadyPaidException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class PaymentExceptionHandler {

    private final ApiErrorResponseCreator apiErrorResponseCreator;
    private final ErrorDebugMessageCreator errorDebugMessageCreator;

    @ExceptionHandler(PaymentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorResponse handlePaymentNotFoundException(
            final PaymentNotFoundException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.NOT_FOUND);
        log.error(
                "Handle payment not found exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentEventProcessingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handlePaymentEventProcessingException(
            final PaymentEventProcessingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment event processing exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentIntentProcessingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handlePaymentIntentProcessingException(
            final PaymentIntentProcessingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment intent processing exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentMethodProcessingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handlePaymentMethodProcessingException(
            final PaymentMethodProcessingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment method processing exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentEventParsingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handlePaymentEventParsingException(
            final PaymentEventParsingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment event parsing exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(CardTokenCreationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleCardTokenCreationException(
            final CardTokenCreationException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle card token creation exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(CardTokenRetrievingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleCardTokenRetrievingException(
            final CardTokenRetrievingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle card token retrieving exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(CustomerRetrievingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleCustomerRetrievingException(
            final CustomerRetrievingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle customer retrieving exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentMethodNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorResponse handlePaymentMethodNotFoundException(
            final PaymentMethodNotFoundException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment method not found exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(PaymentMethodRetrievingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handlePaymentMethodRetrievingException(
            final PaymentMethodRetrievingException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle payment method retrieving exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }

    @ExceptionHandler(ShoppingCartAlreadyPaidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleShoppingCartAlreadyPaidException(
            final ShoppingCartAlreadyPaidException exception) {
        ApiErrorResponse apiErrorResponse = apiErrorResponseCreator
                .buildResponse(exception, HttpStatus.BAD_REQUEST);
        log.error(
                "Handle shopping cart already paid exception: failed: message: {}, debugMessage: {}.",
                apiErrorResponse.message(),
                errorDebugMessageCreator.buildErrorDebugMessage(exception));

        return apiErrorResponse;
    }
}
