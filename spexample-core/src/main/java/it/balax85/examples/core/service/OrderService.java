package it.balax85.examples.core.service;

import it.balax85.examples.common.dto.OrderDto;
import it.balax85.examples.common.service.IOrderService;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public class OrderService implements IOrderService {
    @Override
    public OrderDto insertOrder(OrderDto order) {
        return null;
    }

    @Override
    public OrderDto findById(Long id) {
        return null;
    }

    @Override
    public List<OrderDto> getOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }
}
