package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IOrderDao;
import it.balax85.examples.common.dto.OrderDto;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
public class OrderDao implements IOrderDao {
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
