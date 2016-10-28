package it.balax85.examples.core.mapper;

import it.balax85.examples.common.dbo.OrderDbo;
import it.balax85.examples.common.dto.OrderDto;
import it.balax85.examples.common.entity.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by andrea on 28/10/16.
 */
@Mapper(uses = ItemMapper.class)
public interface OrderMapper {

    OrderDto map(OrderDbo orderDbo);

    OrderDbo map(Order order);

    @InheritInverseConfiguration
    Order map2entity(OrderDbo orderDbo);

    @InheritInverseConfiguration
    OrderDbo map2Dbo(OrderDto orderDto);

    @InheritInverseConfiguration
    List<OrderDto> map2Dto(List<OrderDbo> orderDboList);

    @InheritInverseConfiguration
    List<OrderDbo> map2Dbo(List<Order> orderList);

}
