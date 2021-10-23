package com.practice.order.domain.order.payment.validator;

import com.practice.order.domain.order.Order;
import com.practice.order.domain.order.OrderCommand;

public interface PaymentValidator {
    void validate(Order order, OrderCommand.PaymentRequest paymentRequest);
}
