package it.balax85.examples.common.dao;

import it.balax85.examples.common.dbo.CommissionDbo;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface ICommissionDao {

    /**
     * insert a new order
     * @param commission the order to insert
     * @return the order inserted
     */
    CommissionDbo insertCommission(CommissionDbo commission);

    /**
     * find an order from and id
     * @param id the order's id
     * @return the order found
     */
    CommissionDbo findById(Long id);

    /**
     * get all the orders
     * @return the orders
     */
    List<CommissionDbo> getCommissions();

    /**
     * delete an order from an id
     * @param id the order's id
     */
    void deleteCommission(Long id);

}
