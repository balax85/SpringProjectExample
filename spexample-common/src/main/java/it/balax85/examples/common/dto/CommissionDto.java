package it.balax85.examples.common.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public class CommissionDto {

    private Long id;

    private Date commissionDate;

    private List<ItemDto> items;

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

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommissionDto commissionDto = (CommissionDto) o;

        if (id != null ? !id.equals(commissionDto.id) : commissionDto.id != null) return false;
        if (commissionDate != null ? !commissionDate.equals(commissionDto.commissionDate) : commissionDto.commissionDate != null) return false;
        return items != null ? items.equals(commissionDto.items) : commissionDto.items == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commissionDate != null ? commissionDate.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}
