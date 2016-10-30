package it.balax85.examples.core.web.controller;

import it.balax85.examples.common.dto.IngredientDto;
import it.balax85.examples.common.service.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andrea on 30/10/16.
 */
@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private IIngredientService ingredientService;

    @Autowired
    public IngredientController(IIngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public IngredientDto insertOrder(IngredientDto ingredient) {
        return ingredientService.insertIngredient(ingredient);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public IngredientDto findById(@PathVariable("id") Long id) {
        return ingredientService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<IngredientDto> getIngredients() {
        return ingredientService.getIngredients();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteOrder(Long id) {
        ingredientService.deleteIngredient(id);
    }

}
