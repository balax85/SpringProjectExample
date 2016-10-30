package it.balax85.examples.core;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrea on 23/10/16.
 */
@SpringBootApplication
public class SpringProjectExampleApplication extends SpringBootServletInitializer {

    public static final String  APPLICATION_NAME = "spe";

    private static Map<String, Object> props = new HashMap<>();

    static {
        String appScanRootDirectory = "classpath:" + APPLICATION_NAME + ".properties";
        String appConfigurationDirectory = "classpath:conf/";
        String appConfAppName = "classpath:" + APPLICATION_NAME + "/";
        String[] scanDirectories = new String[] {
                appScanRootDirectory,
                appConfigurationDirectory,
                appConfAppName
        };
        props.put("spring,config.name", APPLICATION_NAME);
        props.put("spring.config.location", StringUtils.arrayToDelimitedString(scanDirectories, ","));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder
                .sources(SpringProjectExampleApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .properties(props);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringProjectExampleApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .properties(props)
                .run(args);
    }

}
