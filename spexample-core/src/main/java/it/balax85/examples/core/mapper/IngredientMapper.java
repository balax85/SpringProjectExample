package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dbo.ItemDbo;
import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.entity.Ingredient;
import it.balax85.examples.common.entity.Item;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

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

    @InheritInverseConfiguration
    List<IngredientDto> map2Dto(List<IngredientDbo> itemDboList);

    @InheritInverseConfiguration
    List<IngredientDbo> map2Dbo(List<Ingredient> ingredientList);

}
