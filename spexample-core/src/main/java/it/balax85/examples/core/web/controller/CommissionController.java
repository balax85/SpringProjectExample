package it.balax85.examples.core.web.controller;

import it.balax85.examples.common.dto.CommissionDto;
import it.balax85.examples.common.service.ICommissionService;
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
@RequestMapping("/Commission")
public class CommissionController {

    private ICommissionService commissionService;

    @Autowired
    public CommissionController(ICommissionService commissionService) {
        this.commissionService = commissionService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CommissionDto insertOrder(CommissionDto order) {
        return commissionService.insertCommission(order);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CommissionDto findById(@PathVariable("id") Long id) {
        return commissionService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CommissionDto> getOrders() {
        return commissionService.getCommissions();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteOrder(Long id) {
        commissionService.deleteCommission(id);
    }

}
