package dev.naimsulejmani.locationservicegr2.controllers.advices;

import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.NotFoundException;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public static ResponseEntity<?> handleException(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(AlreadyExistException.class)
    public static ResponseEntity<?> handleException(AlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler(UnauthorizedException.class)
    public static ResponseEntity<?> handleException(UnauthorizedException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public static ResponseEntity<?> handleException(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
    }



}












