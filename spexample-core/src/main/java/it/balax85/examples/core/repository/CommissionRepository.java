package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Commission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
public interface CommissionRepository extends CrudRepository<Commission, Long> {

    List<Commission> findAll();

    @Query
    Commission findById(@Param("id") Long id);

}
