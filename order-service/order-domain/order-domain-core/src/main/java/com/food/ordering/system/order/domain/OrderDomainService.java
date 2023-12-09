package com.food.ordering.system.order.domain;

import com.food.ordering.system.order.domain.entity.Order;
import com.food.ordering.system.order.domain.entity.Restaurant;
import com.food.ordering.system.order.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.domain.event.OrderEvent;
import com.food.ordering.system.order.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);

}
