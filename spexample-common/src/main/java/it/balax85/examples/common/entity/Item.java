package it.balax85.examples.common.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Entity
@Table(name="ITEM")
public class Item {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "ITEM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Lob
    @Column(name = "CONTENT")
    private String content;

    @Column(name = "PRICE")
    private Float price;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<IngredientItem> ingredientItems;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemOrder> itemOrders;

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

    public List<IngredientItem> getIngredientItems() {
        return ingredientItems;
    }

    public void setIngredientItems(List<IngredientItem> ingredientItems) {
        this.ingredientItems = ingredientItems;
    }

    public List<ItemOrder> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(List<ItemOrder> itemOrders) {
        this.itemOrders = itemOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (itemName != null ? !itemName.equals(item.itemName) : item.itemName != null) return false;
        if (content != null ? !content.equals(item.content) : item.content != null) return false;
        if (price != null ? !price.equals(item.price) : item.price != null) return false;
        if (!ingredientItems.equals(item.ingredientItems)) return false;
        return itemOrders.equals(item.itemOrders);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + ingredientItems.hashCode();
        result = 31 * result + itemOrders.hashCode();
        return result;
    }
}
