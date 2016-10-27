package it.balax85.examples.common.dao;

import it.balax85.examples.common.dbo.OrderDbo;
import it.balax85.examples.common.dto.OrderDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IOrderDao {

    /**
     * insert a new order
     * @param order the order to insert
     * @return the order inserted
     */
    OrderDbo insertOrder(OrderDbo order);

    /**
     * find an order from and id
     * @param id the order's id
     * @return the order found
     */
    OrderDbo findById(Long id);

    /**
     * get all the orders
     * @return the orders
     */
    List<OrderDbo> getOrders();

    /**
     * delete an order from an id
     * @param id the order's id
     */
    void deleteOrder(Long id);

}
