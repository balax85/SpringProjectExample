package it.balax85.examples.common.dbo;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public class ItemDbo {

    private Long id;

    private String itemName;

    private String content;

    private Float price;

    private List<IngredientDbo> ingredients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<IngredientDbo> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDbo> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemDbo itemDbo = (ItemDbo) o;

        if (id != null ? !id.equals(itemDbo.id) : itemDbo.id != null) return false;
        if (itemName != null ? !itemName.equals(itemDbo.itemName) : itemDbo.itemName != null) return false;
        if (content != null ? !content.equals(itemDbo.content) : itemDbo.content != null) return false;
        if (price != null ? !price.equals(itemDbo.price) : itemDbo.price != null) return false;
        return ingredients != null ? ingredients.equals(itemDbo.ingredients) : itemDbo.ingredients == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        return result;
    }
}
