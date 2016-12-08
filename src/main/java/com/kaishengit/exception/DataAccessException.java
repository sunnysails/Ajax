package com.kaishengit.exception;

/**
 * Created by sunny on 2016/12/8.
 */
public class DataAccessException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public DataAccessException() {}

    public DataAccessException(String message) {
        super( message );
    }

    public DataAccessException(String message, Throwable cause) {
        super( message, cause );
    }

    public DataAccessException(Throwable cause) {
        super( cause );
    }
}
