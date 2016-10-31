package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IIngredientDao;
import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.core.mapper.IngredientMapper;
import it.balax85.examples.core.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
@Repository
public class IngredientDao implements IIngredientDao {

    private IngredientRepository ingredientRepository;

    private IngredientMapper ingredientMapper;

    @Autowired
    public IngredientDao(IngredientRepository ingredientRepository,IngredientMapper ingredientMapper) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientMapper = ingredientMapper;
    }

    @Override
    public IngredientDbo insertIngredient(IngredientDbo ingredient) {
        return ingredientMapper.map(ingredientRepository.save(ingredientMapper.map2entity(ingredient)));
    }

    @Override
    public IngredientDbo findById(Long id) {
        return ingredientMapper.map(ingredientRepository.findById(id));
    }

    @Override
    public List<IngredientDbo> getIngredients() {
        return ingredientMapper.map2Dbo(ingredientRepository.findAll());
    }

    @Override
    public void deleteIngredient(Long id) {
        ingredientRepository.delete(id);
    }
}
