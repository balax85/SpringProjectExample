package it.balax85.examples.common.entity;

import javax.persistence.*;

/**
 * Created by andrea on 30/10/16.
 */
@Entity
@Table(name = "ITEM_INGREDIENT")
public class IngredientItem {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "ITEM_INGREDIENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_INGREDINT", referencedColumnName = "ID")
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name = "ID_ITEM", referencedColumnName = "ID")
    private Item item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngredientItem that = (IngredientItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ingredient != null ? !ingredient.equals(that.ingredient) : that.ingredient != null) return false;
        return item != null ? item.equals(that.item) : that.item == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ingredient != null ? ingredient.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        return result;
    }
}
