package com.practice.order.application.order;

import com.practice.order.domain.notification.NotificationService;
import com.practice.order.domain.order.OrderCommand;
import com.practice.order.domain.order.OrderInfo;
import com.practice.order.domain.order.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderFacade {
    private final OrderService orderService;
    private final NotificationService notificationService;

    public String registerOrder(OrderCommand.RegisterOrder registerOrder) {
        var orderToken = orderService.registerOrder(registerOrder);
        notificationService.sendKakao("010-1234-5678", "content");
        return orderToken;
    }

    public OrderInfo.Main retrieveOrder(String orderToken) {
        return orderService.retrieveOrder(orderToken);
    }

    public void paymentOrder(OrderCommand.PaymentRequest paymentRequest) {
        orderService.paymentOrder(paymentRequest);
        notificationService.sendKakao("010-1234-5678", "send content");
    }

    public void updateReceiverInfo(String orderToken, OrderCommand.UpdateReceiverInfoRequest orderCommand) {
        orderService.updateReceiverInfo(orderToken, orderCommand);
        notificationService.sendKakao(null, null);
    }
}
