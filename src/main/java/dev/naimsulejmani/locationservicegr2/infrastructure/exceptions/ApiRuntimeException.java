package dev.naimsulejmani.locationservicegr2.infrastructure.exceptions;

public class ApiRuntimeException extends RuntimeException {
    public ApiRuntimeException() {
    }

    public ApiRuntimeException(String message) {
        super(message);
    }

    public ApiRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiRuntimeException(Throwable cause) {
        super(cause);
    }

    public ApiRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
