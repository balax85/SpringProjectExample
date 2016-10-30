package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.entity.Ingredient;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

/**
 * Created by andrea on 30/10/16.
 */
@Mapper
public interface IngredientMapper {

    IngredientDto map(IngredientDbo ingredientDbo);

    IngredientDbo map(Ingredient ingredient);

    @InheritInverseConfiguration
    Ingredient map2entity(IngredientDbo ingredientDbo);

    @InheritInverseConfiguration
    IngredientDbo map2Dbo(IngredientDto ingredientDto);


}
