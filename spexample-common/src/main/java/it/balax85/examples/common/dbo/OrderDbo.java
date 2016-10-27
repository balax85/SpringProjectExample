package it.balax85.examples.common.dbo;

import java.util.Date;
import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public class OrderDbo {

    private Long id;

    private Date orderDate;

    private List<ItemDbo> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<ItemDbo> getItems() {
        return items;
    }

    public void setItems(List<ItemDbo> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDbo orderDbo = (OrderDbo) o;

        if (id != null ? !id.equals(orderDbo.id) : orderDbo.id != null) return false;
        if (orderDate != null ? !orderDate.equals(orderDbo.orderDate) : orderDbo.orderDate != null) return false;
        return items != null ? items.equals(orderDbo.items) : orderDbo.items == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}
