package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Commission;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
@Repository
@EnableTransactionManagement
@Transactional(value = "springProjectTxManager")
public interface CommissionRepository extends CrudRepository<Commission, Long> {

    List<Commission> findAll();

    @Query
    Commission findById(@Param("id") Long id);

}
