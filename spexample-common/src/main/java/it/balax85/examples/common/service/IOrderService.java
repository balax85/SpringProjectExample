package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.OrderDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IOrderService {

    /**
     * insert a new order
     * @param order the new order to insert
     * @return return the order inserted
     */
    OrderDto insertOrder(OrderDto order);

    /**
     * find a order with the id
     * @param id the order's id to find
     * @return the order found
     */
    OrderDto findById(Long id);

    /**
     * get all the orders
     * @return the orders list
     */
    List<OrderDto> getOrders();

    /**
     * delete the order
     * @param id the order's id to delete
     */
    void deleteOrder(Long id);

}
