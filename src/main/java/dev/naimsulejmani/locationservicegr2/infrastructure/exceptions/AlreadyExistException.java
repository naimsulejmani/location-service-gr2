package dev.naimsulejmani.locationservicegr2.infrastructure.exceptions;

public class AlreadyExistException extends ApiRuntimeException {
    public AlreadyExistException() {
    }

    public AlreadyExistException(String message) {
        super(message);
    }
}
