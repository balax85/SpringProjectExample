package it.balax85.examples.common.dbo;

import it.balax85.examples.common.util.IngredientType;

/**
 * Created by andrea on 30/10/16.
 */
public class IngredientDbo {

    private Long id;

    private IngredientType ingredientType;

    private String ingredientName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
