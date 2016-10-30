package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    List<Ingredient> findAll();

    @Query
    Ingredient findById(@Param("id") Long id);

}
