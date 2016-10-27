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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ORDER_ITEM", joinColumns = {
            @JoinColumn(name = "ID", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "ID", nullable = false)
    })
    private List<Item> items;

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
