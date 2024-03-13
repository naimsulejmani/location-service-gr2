package dev.naimsulejmani.locationservicegr2.infrastructure.exceptions;

public class UnauthorizedException extends ApiRuntimeException {
    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
