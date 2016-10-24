package it.balax85.examples.core.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by andrea on 24/10/16.
 */
@Configuration
@ImportResource(locations = "classpath:persistence-context.xml")
public class DatabaseConfiguration {
}
