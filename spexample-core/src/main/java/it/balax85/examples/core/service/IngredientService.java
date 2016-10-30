package it.balax85.examples.core.service;

import it.balax85.examples.common.dao.IIngredientDao;
import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.service.IIngredientService;
import it.balax85.examples.core.mapper.IngredientMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
public class IngredientService implements IIngredientService {

    private static final Logger logger = LoggerFactory.getLogger(IngredientService.class);

    private IIngredientDao ingredientDao;

    private IngredientMapper ingredientMapper;

    @Autowired
    public IngredientService(IIngredientDao ingredientDao, IngredientMapper ingredientMapper) {
        this.ingredientDao = ingredientDao;
        this.ingredientMapper = ingredientMapper;
    }

    @Override
    public IngredientDto insertIngredient(IngredientDto ingredient) {
        IngredientDbo ingredientDbo = ingredientMapper.map2Dbo(ingredient);
        IngredientDbo createdIngredient = ingredientDao.insertIngredient(ingredientDbo);
        return ingredientMapper.map(createdIngredient);
    }

    @Override
    public IngredientDto findById(Long id) {
        return ingredientMapper.map(ingredientDao.findById(id));
    }

    @Override
    public List<IngredientDto> getIngredients() {
        return ingredientMapper.map2Dto(ingredientDao.getIngredients());
    }

    @Override
    public void deleteIngredient(Long id) {
        ingredientDao.deleteIngredient(id);
    }

}
