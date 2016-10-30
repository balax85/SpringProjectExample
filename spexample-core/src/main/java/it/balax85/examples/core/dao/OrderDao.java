package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IOrderDao;
import it.balax85.examples.common.dbo.OrderDbo;
import it.balax85.examples.common.dto.OrderDto;
import it.balax85.examples.core.mapper.OrderMapper;
import it.balax85.examples.core.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
public class OrderDao implements IOrderDao {

    private OrderRepository orderRepository;

    private OrderMapper orderMapper;

    @Autowired
    public OrderDao(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public OrderDbo insertOrder(OrderDbo order) {
        return orderMapper.map(orderRepository.save(orderMapper.map2entity(order)));
    }

    @Override
    public OrderDbo findById(Long id) {
        return orderMapper.map(orderRepository.findById(id));
    }

    @Override
    public List<OrderDbo> getOrders() {
        return orderMapper.map2Dbo(orderRepository.findAll());
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.delete(id);
    }
}
