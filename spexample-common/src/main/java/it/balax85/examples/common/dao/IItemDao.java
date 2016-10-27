package it.balax85.examples.common.dao;

import it.balax85.examples.common.dbo.ItemDbo;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
public interface IItemDao {

    /**
     * insert a new item
     * @param item the item to insert
     * @return the item inserted
     */
    ItemDbo insertItem(ItemDbo item);

    /**
     * find and item from the id
     * @param id the item's id
     * @return
     */
    ItemDbo findById(Long id);

    /**
     * get all the items
     * @return all the items
     */
    List<ItemDbo> getItems();

    /**
     * delete an items from an id
     * @param id the item's id
     */
    void deleteItem(Long id);

}
