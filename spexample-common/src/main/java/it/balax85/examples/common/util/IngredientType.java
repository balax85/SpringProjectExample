package it.balax85.examples.common.util;

/**
 * Created by andrea on 30/10/16.
 */
public enum IngredientType {

    DOUGH(1, "DOUGH"),
    MEAT(2, "MEAT"),
    VEGETABLE(2, "VEGETABLE"),
    FISH(3, "FISH");

    private Integer id;

    private String type;

    IngredientType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static IngredientType getById(Integer id) {
        for (IngredientType ingredientType : values()) {
            if (ingredientType.getId().equals(id)) {
                return ingredientType;
            }
        }
        throw new RuntimeException("Ingredient type with id " + id + " not found");
    }
}
