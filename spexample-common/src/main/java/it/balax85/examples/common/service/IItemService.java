package it.balax85.examples.common.service;

import it.balax85.examples.common.dto.ItemDto;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IItemService {

    /**
     * insert a new item
     * @param item the new item to insert
     * @return return the item inserted
     */
    ItemDto insertItem(ItemDto item);

    /**
     * find a item with the id
     * @param id the item's id to find
     * @return the item found
     */
    ItemDto findById(Long id);

    /**
     * get all the items
     * @return the items list
     */
    List<ItemDto> getItems();

    /**
     * delete the item
     * @param id the item's id to delete
     */
    void deleteItem(Long id);

}
