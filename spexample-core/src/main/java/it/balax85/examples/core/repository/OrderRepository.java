package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findAll();

    @Query
    Order findById(@Param("id") Long id);

}
