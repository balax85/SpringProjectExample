package it.balax85.examples.common.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "ORDER_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemOrder> itemOrders;

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

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
        return itemOrders != null ? itemOrders.equals(order.itemOrders) : order.itemOrders == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (itemOrders != null ? itemOrders.hashCode() : 0);
        return result;
    }
}
