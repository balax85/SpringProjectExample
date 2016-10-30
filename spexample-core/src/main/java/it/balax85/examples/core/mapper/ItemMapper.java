package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.ItemDbo;
import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.entity.Item;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
@Mapper(uses = IngredientMapper.class)
public interface ItemMapper {

    ItemDto map(ItemDbo itemDbo);

    ItemDbo map(Item item);

    @InheritInverseConfiguration
    Item map2entity(ItemDbo itemDbo);

    @InheritInverseConfiguration
    ItemDbo map2Dbo(ItemDto itemDto);

    @InheritInverseConfiguration
    List<ItemDto> map2Dto(List<ItemDbo> itemDboList);

    @InheritInverseConfiguration
    List<ItemDbo> map2Dbo(List<Item> itemList);

}
