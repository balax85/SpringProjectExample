package it.balax85.examples.spe.core.service;

import it.balax85.examples.common.service.IIngredientService;
import it.balax85.examples.core.SpringProjectExampleApplication;
import it.balax85.examples.spe.DbUnitTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by andrea on 30/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringProjectExampleApplication.class)
public class IngredientServiceTest extends DbUnitTest {

    @Autowired
    IIngredientService ingredientService;

    @Test
    public void fakeTest() {

    }

}
