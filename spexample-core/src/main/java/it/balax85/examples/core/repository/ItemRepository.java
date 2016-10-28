package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAll();

    @Query
    List<Item> findById(@Param("id") Long id);

}
