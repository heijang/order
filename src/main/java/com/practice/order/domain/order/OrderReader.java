package com.practice.order.domain.order;

public interface OrderReader {
    Order getOrder(String orderToken);
}
