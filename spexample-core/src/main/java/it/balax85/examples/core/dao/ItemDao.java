package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IItemDao;
import it.balax85.examples.common.dto.ItemDto;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
public class ItemDao implements IItemDao {

    @Override
    public ItemDto insertItem(ItemDto item) {
        return null;
    }

    @Override
    public ItemDto findById(Long id) {
        return null;
    }

    @Override
    public List<ItemDto> getItems() {
        return null;
    }

    @Override
    public void deleteItem(Long id) {

    }
}
