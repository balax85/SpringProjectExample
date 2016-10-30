package it.balax85.examples.common.entity;

import javax.persistence.*;

/**
 * Created by andrea on 30/10/16.
 */
@Entity
@Table(name = "ORDER_ITEM")
public class ItemOrder {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "ORDER_ITEM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_ITEM", referencedColumnName = "ID")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "ID_ORDER", referencedColumnName = "ID")
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemOrder itemOrder = (ItemOrder) o;

        if (id != null ? !id.equals(itemOrder.id) : itemOrder.id != null) return false;
        if (item != null ? !item.equals(itemOrder.item) : itemOrder.item != null) return false;
        return order != null ? order.equals(itemOrder.order) : itemOrder.order == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }
}
