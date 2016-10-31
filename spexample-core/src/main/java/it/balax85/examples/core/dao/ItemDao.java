package it.balax85.examples.core.dao;

import it.balax85.examples.common.dao.IItemDao;
import it.balax85.examples.common.dbo.ItemDbo;
import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.core.mapper.ItemMapper;
import it.balax85.examples.core.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by andrea on 27/10/16.
 */
@Repository
public class ItemDao implements IItemDao {

    private ItemRepository itemRepository;

    private ItemMapper itemMapper;

    @Autowired
    public ItemDao(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    @Override
    public ItemDbo insertItem(ItemDbo item) {
        return itemMapper.map(itemRepository.save(itemMapper.map2entity(item)));
    }

    @Override
    public ItemDbo findById(Long id) {
        return itemMapper.map(itemRepository.findById(id));
    }

    @Override
    public List<ItemDbo> getItems() {
        return itemMapper.map2Dbo(itemRepository.findAll());
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.delete(id);
    }
}
