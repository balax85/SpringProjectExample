package it.balax85.examples.core.repository;

import it.balax85.examples.common.entity.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public interface IngredientRepository {

    List<Ingredient> findAll();

    @Query
    List<Ingredient> findById(@Param("id") Long id);

}
