package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.IngredientDbo;
import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.entity.Ingredient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-11-16T08:35:35+0100",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class IngredientMapperImpl implements IngredientMapper {

    @Override
    public IngredientDto map(IngredientDbo ingredientDbo) {
        if ( ingredientDbo == null ) {
            return null;
        }

        IngredientDto ingredientDto = new IngredientDto();

        ingredientDto.setId( ingredientDbo.getId() );
        ingredientDto.setIngredientType( ingredientDbo.getIngredientType() );
        ingredientDto.setIngredientName( ingredientDbo.getIngredientName() );

        return ingredientDto;
    }

    @Override
    public IngredientDbo map(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientDbo ingredientDbo = new IngredientDbo();

        ingredientDbo.setId( ingredient.getId() );
        ingredientDbo.setIngredientType( ingredient.getIngredientType() );

        return ingredientDbo;
    }

    @Override
    public Ingredient map2entity(IngredientDbo ingredientDbo) {
        if ( ingredientDbo == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setId( ingredientDbo.getId() );
        ingredient.setIngredientType( ingredientDbo.getIngredientType() );

        return ingredient;
    }

    @Override
    public IngredientDbo map2Dbo(IngredientDto ingredientDto) {
        if ( ingredientDto == null ) {
            return null;
        }

        IngredientDbo ingredientDbo = new IngredientDbo();

        ingredientDbo.setId( ingredientDto.getId() );
        ingredientDbo.setIngredientType( ingredientDto.getIngredientType() );
        ingredientDbo.setIngredientName( ingredientDto.getIngredientName() );

        return ingredientDbo;
    }

    @Override
    public List<IngredientDto> map2Dto(List<IngredientDbo> itemDboList) {
        if ( itemDboList == null ) {
            return null;
        }

        List<IngredientDto> list = new ArrayList<IngredientDto>();
        for ( IngredientDbo ingredientDbo : itemDboList ) {
            list.add( map( ingredientDbo ) );
        }

        return list;
    }

    @Override
    public List<IngredientDbo> map2Dbo(List<Ingredient> ingredientList) {
        if ( ingredientList == null ) {
            return null;
        }

        List<IngredientDbo> list = new ArrayList<IngredientDbo>();
        for ( Ingredient ingredient : ingredientList ) {
            list.add( map( ingredient ) );
        }

        return list;
    }
}
