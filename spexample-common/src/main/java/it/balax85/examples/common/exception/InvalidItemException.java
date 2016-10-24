package it.balax85.examples.common.exception;

/**
 * Created by andrea on 23/10/16.
 */
public class InvalidItemException extends RuntimeException {

    public InvalidItemException(String msg) {
        super(msg);
    }

    public InvalidItemException(String msg, Throwable t) {
        super(msg, t);
    }
}
