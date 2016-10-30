package it.balax85.examples.common.dao;

import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dbo.OrderDbo;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public interface IIngredientDao {

    /**
     * insert a new ingredient
     * @param ingredient the ingredient to insert
     * @return the ingredient inserted
     */
    OrderDbo insertIngredient(IngredientDbo ingredient);

    /**
     * find an ingredient from and id
     * @param id the ingredient's id
     * @return the ingredient found
     */
    IngredientDbo findById(Long id);

    /**
     * get all the orders
     * @return the orders
     */
    List<IngredientDbo> getIngredients();

    /**
     * delete an ingredient from an id
     * @param id the ingredient's id
     */
    void deleteIngredient(Long id);

}
