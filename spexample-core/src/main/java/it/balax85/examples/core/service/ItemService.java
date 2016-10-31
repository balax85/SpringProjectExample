package it.balax85.examples.core.service;

import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.service.IItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
@Service
public class ItemService implements IItemService {
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
