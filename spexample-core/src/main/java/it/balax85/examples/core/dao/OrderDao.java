package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IOrderDao;
import it.balax85.examples.common.dbo.OrderDbo;
import it.balax85.examples.common.dto.OrderDto;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
public class OrderDao implements IOrderDao {

    @Override
    public OrderDbo insertOrder(OrderDbo order) {
        return null;
    }

    @Override
    public OrderDbo findById(Long id) {
        return null;
    }

    @Override
    public List<OrderDbo> getOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }
}
