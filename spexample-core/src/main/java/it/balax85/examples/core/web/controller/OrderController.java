package it.balax85.examples.core.web.controller;

import it.balax85.examples.common.dto.OrderDto;
import it.balax85.examples.common.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andrea on 23/10/16.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private IOrderService orderService;

    @Autowired
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto insertOrder(OrderDto order) {
        return orderService.insertOrder(order);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto findById(@PathVariable("id") Long id) {
        return orderService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderDto> getOrders() {
        return orderService.getOrders();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteOrder(Long id) {

    }

}
