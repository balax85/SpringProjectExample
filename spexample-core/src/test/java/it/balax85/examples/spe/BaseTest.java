package it.balax85.examples.spe;

import it.balax85.examples.core.SpringProjectExampleApplication;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by andrea on 30/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringProjectExampleApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
@TestPropertySource(value = "classpath:spe-test.properties")
public abstract class BaseTest {

    protected Logger logger = LoggerFactory.getLogger(getClass());

}
