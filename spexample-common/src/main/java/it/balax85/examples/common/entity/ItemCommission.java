package it.balax85.examples.common.entity;

import javax.persistence.*;

/**
 * Created by andrea on 30/10/16.
 */
@Entity
@Table(name = "COMMISSION_ITEM")
public class ItemCommission {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "COMMISSION_ITEM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_ITEM", referencedColumnName = "ID")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "ID_COMMISSION", referencedColumnName = "ID")
    private Commission commission;

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

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemCommission itemCommission = (ItemCommission) o;

        if (id != null ? !id.equals(itemCommission.id) : itemCommission.id != null) return false;
        if (item != null ? !item.equals(itemCommission.item) : itemCommission.item != null) return false;
        return commission != null ? commission.equals(itemCommission.commission) : itemCommission.commission == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (commission != null ? commission.hashCode() : 0);
        return result;
    }
}
