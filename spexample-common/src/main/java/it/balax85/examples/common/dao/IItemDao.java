package it.balax85.examples.common.dao;

import it.balax85.examples.common.dto.ItemDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IItemDao {

    ItemDto insertItem(ItemDto item);

    ItemDto findById(Long id);

    List<ItemDto> getItems();

    void deleteItem(Long id);

}
