package dev.naimsulejmani.locationservicegr2.infrastructure.exceptions;

public class NotFoundException extends ApiRuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
