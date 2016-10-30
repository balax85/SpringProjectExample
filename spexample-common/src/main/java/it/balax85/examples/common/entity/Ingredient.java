package it.balax85.examples.common.entity;

import it.balax85.examples.common.util.IngredientType;

import javax.persistence.*;
import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
@Entity
@Table(name = "INGREDIENT")
public class Ingredient {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "INGREDIENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "INGREDIENT_TYPE")
    @Enumerated(EnumType.ORDINAL)
    private IngredientType ingredientType;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
    private List<IngredientItem> ingredientItems;

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

    public List<IngredientItem> getIngredientItems() {
        return ingredientItems;
    }

    public void setIngredientItems(List<IngredientItem> ingredientItems) {
        this.ingredientItems = ingredientItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ingredientType != that.ingredientType) return false;
        return ingredientItems.equals(that.ingredientItems);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ingredientType != null ? ingredientType.hashCode() : 0);
        result = 31 * result + ingredientItems.hashCode();
        return result;
    }
}
