package com.practice.order.domain.order.gift;

import com.practice.order.domain.order.OrderCommand;

public interface GiftOrderService {
    void paymentOrder(OrderCommand.PaymentRequest paymentRequest);
}
