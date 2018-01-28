package it.balax85.examples.common.entity;

import antlr.collections.Enumerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Entity
@Table(name = "COMMISSION")
public class Commission {

    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "COMMISSION_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMMISSION_DATE")
    private Date commissionDate;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemCommission> itemCommissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCommissionDate() {
        return commissionDate;
    }

    public void setCommissionDate(Date commissionDate) {
        this.commissionDate = commissionDate;
    }

    public List<ItemCommission> getItemCommissions() {
        return itemCommissions;
    }

    public void setItemCommissions(List<ItemCommission> itemCommissions) {
        this.itemCommissions = itemCommissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commission commission = (Commission) o;

        if (id != null ? !id.equals(commission.id) : commission.id != null) return false;
        if (commissionDate != null ? !commissionDate.equals(commission.commissionDate) : commission.commissionDate != null) return false;
        return itemCommissions != null ? itemCommissions.equals(commission.itemCommissions) : commission.itemCommissions == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commissionDate != null ? commissionDate.hashCode() : 0);
        result = 31 * result + (itemCommissions != null ? itemCommissions.hashCode() : 0);
        return result;
    }
}
