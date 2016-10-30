package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.dto.ItemDto;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public interface IIngredientService {

    /**
     * insert a new ingredient
     * @param item the new ingredient to insert
     * @return return the ingredient inserted
     */
    IngredientDto insertIngredient(IngredientDto item);

    /**
     * find a ingredient with the id
     * @param id the ingredient's id to find
     * @return the ingredient found
     */
    IngredientDto findById(Long id);

    /**
     * get all the ingredient
     * @return the ingredient list
     */
    List<IngredientDto> getIngredients();

    /**
     * delete the ingredient
     * @param id the ingredient's id to delete
     */
    void deleteIngredient(Long id);

}
