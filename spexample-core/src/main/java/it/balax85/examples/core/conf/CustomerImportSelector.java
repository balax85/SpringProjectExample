package it.balax85.examples.core.conf;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * Created by andrea on 23/10/16.
 */
public class CustomerImportSelector implements ImportSelector, EnvironmentAware {

    private static final String PACKAGE = "it.balax85.examples.%s";
    private static final String CONFIG_CLASS = "CustomerConfig";

    private Environment env;

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        String customer = env.getProperty("spe.customer");
        System.out.println("Customer ENV = " + customer);
        if (!StringUtils.isEmpty(customer)) {
            String klass = String.format(PACKAGE, customer) + "." + CONFIG_CLASS;
            boolean klassFound;
            try {
                Class.forName(klass);
                klassFound = true;
            } catch (ClassNotFoundException c) {
                klassFound = false;
            }
            if (klassFound) {
                return new String[] {klass};
            }
        }
        return new String[0];
    }
}
