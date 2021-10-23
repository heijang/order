package com.practice.order.domain.order.payment;

import com.practice.order.domain.order.Order;
import com.practice.order.domain.order.OrderCommand;

public interface PaymentProcessor {
    void pay(Order order, OrderCommand.PaymentRequest paymentRequest);
}
