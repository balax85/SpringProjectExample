package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.CommissionDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface ICommissionService {

    /**
     * insert a new order
     * @param Commission the new order to insert
     * @return return the order inserted
     */
    CommissionDto insertCommission(CommissionDto Commission);

    /**
     * find a order with the id
     * @param id the order's id to find
     * @return the order found
     */
    CommissionDto findById(Long id);

    /**
     * get all the orders
     * @return the orders list
     */
    List<CommissionDto> getCommissions();

    /**
     * delete the order
     * @param id the order's id to delete
     */
    void deleteCommission(Long id);

}
