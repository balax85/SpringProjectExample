package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.OrderDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IOrderService {

    OrderDto insertOrder(OrderDto order);

    OrderDto findById(Long id);

    List<OrderDto> getOrders();

    void deleteOrder(Long id);

}
