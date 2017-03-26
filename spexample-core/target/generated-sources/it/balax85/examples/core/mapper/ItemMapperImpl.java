package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.ItemDbo;
import it.balax85.examples.common.dto.ItemDto;
import it.balax85.examples.common.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-11-16T08:35:35+0100",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDto map(ItemDbo itemDbo) {
        if ( itemDbo == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setId( itemDbo.getId() );
        itemDto.setItemName( itemDbo.getItemName() );
        itemDto.setContent( itemDbo.getContent() );
        itemDto.setPrice( itemDbo.getPrice() );

        return itemDto;
    }

    @Override
    public ItemDbo map(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDbo itemDbo = new ItemDbo();

        itemDbo.setId( item.getId() );
        itemDbo.setItemName( item.getItemName() );
        itemDbo.setContent( item.getContent() );
        itemDbo.setPrice( item.getPrice() );

        return itemDbo;
    }

    @Override
    public Item map2entity(ItemDbo itemDbo) {
        if ( itemDbo == null ) {
            return null;
        }

        Item item = new Item();

        item.setId( itemDbo.getId() );
        item.setItemName( itemDbo.getItemName() );
        item.setContent( itemDbo.getContent() );
        item.setPrice( itemDbo.getPrice() );

        return item;
    }

    @Override
    public ItemDbo map2Dbo(ItemDto itemDto) {
        if ( itemDto == null ) {
            return null;
        }

        ItemDbo itemDbo = new ItemDbo();

        itemDbo.setId( itemDto.getId() );
        itemDbo.setItemName( itemDto.getItemName() );
        itemDbo.setContent( itemDto.getContent() );
        itemDbo.setPrice( itemDto.getPrice() );

        return itemDbo;
    }

    @Override
    public List<ItemDto> map2Dto(List<ItemDbo> itemDboList) {
        if ( itemDboList == null ) {
            return null;
        }

        List<ItemDto> list = new ArrayList<ItemDto>();
        for ( ItemDbo itemDbo : itemDboList ) {
            list.add( map( itemDbo ) );
        }

        return list;
    }

    @Override
    public List<ItemDbo> map2Dbo(List<Item> itemList) {
        if ( itemList == null ) {
            return null;
        }

        List<ItemDbo> list = new ArrayList<ItemDbo>();
        for ( Item item : itemList ) {
            list.add( map( item ) );
        }

        return list;
    }
}
