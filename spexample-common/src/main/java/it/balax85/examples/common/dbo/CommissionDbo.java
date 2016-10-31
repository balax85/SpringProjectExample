package it.balax85.examples.common.dbo;

import java.util.Date;
import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public class CommissionDbo {

    private Long id;

    private Date commissionDate;

    private List<ItemDbo> items;

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

        CommissionDbo commissionDbo = (CommissionDbo) o;

        if (id != null ? !id.equals(commissionDbo.id) : commissionDbo.id != null) return false;
        if (commissionDate != null ? !commissionDate.equals(commissionDbo.commissionDate) : commissionDbo.commissionDate != null) return false;
        return items != null ? items.equals(commissionDbo.items) : commissionDbo.items == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commissionDate != null ? commissionDate.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}
