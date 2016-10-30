package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IIngredientDao;
import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dbo.OrderDbo;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public class IngredientDao implements IIngredientDao {

    @Override
    public OrderDbo insertIngredient(IngredientDbo ingredient) {
        return null;
    }

    @Override
    public IngredientDbo findById(Long id) {
        return null;
    }

    @Override
    public List<IngredientDbo> getIngredients() {
        return null;
    }

    @Override
    public void deleteIngredient(Long id) {

    }
}
