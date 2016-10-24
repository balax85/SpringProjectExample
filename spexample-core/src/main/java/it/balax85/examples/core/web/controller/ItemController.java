package it.balax85.examples.core.web.controller;

import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    private IItemService itemService;

    @Autowired
    public ItemController(IItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDto inserItem(@RequestBody ItemDto item) {
        return itemService.insertItem(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemDto findById(@PathVariable("id") Long id) {
        return itemService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ItemDto> getItems() {
        return itemService.getItems();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteItem(Long id) {
        itemService.deleteItem(id);
    }

}
