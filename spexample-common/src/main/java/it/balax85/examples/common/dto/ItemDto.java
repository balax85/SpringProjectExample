package it.balax85.examples.common.dto;

/**
 * Created by andrea on 23/10/16.
 */
public class ItemDto {

    private Long id;

    private String itemName;

    private String content;

    private Float price;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemDto itemDto = (ItemDto) o;

        if (id != null ? !id.equals(itemDto.id) : itemDto.id != null) return false;
        if (itemName != null ? !itemName.equals(itemDto.itemName) : itemDto.itemName != null) return false;
        if (content != null ? !content.equals(itemDto.content) : itemDto.content != null) return false;
        return price != null ? price.equals(itemDto.price) : itemDto.price == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
