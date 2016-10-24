package it.balax85.examples.common.exception;

/**
 * Created by andrea on 23/10/16.
 */
public class InvalidOrderException extends RuntimeException {

    public InvalidOrderException(String msg) {
        super(msg);
    }

    public InvalidOrderException(String msg, Throwable t) {
        super(msg, t);
    }

}
