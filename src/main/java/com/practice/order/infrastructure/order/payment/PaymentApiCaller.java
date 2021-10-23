package com.practice.order.infrastructure.order.payment;

import com.practice.order.domain.order.OrderCommand;
import com.practice.order.domain.order.payment.PayMethod;

public interface PaymentApiCaller {
    boolean support(PayMethod payMethod);
    void pay(OrderCommand.PaymentRequest request);
}
