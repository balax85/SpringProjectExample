package it.balax85.examples.core.util;

import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * Created by andrea on 28/10/16.
 */
public class MessageUtils {

    private static ResourceBundleMessageSource messageSource;

    static {
        messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("i18n.messages");
    }

    public static String getMessage(String key, Object... args) {
        String msg = messageSource.getMessage(key, null, Locale.getDefault());
        if (args == null || args.length == 0) {
            return msg;
        }
        return String.format(msg, args);
    }

}
