package dev.naimsulejmani.locationservicegr2.controllers.advices;

import dev.naimsulejmani.locationservicegr2.dtos.ErrorMessage;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.NotFoundException;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.UnauthorizedException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public static ResponseEntity<?> handleException(NotFoundException exception, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), exception.getMessage(),
                request.getDescription(true)
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

    @ExceptionHandler(AlreadyExistException.class)
    public static ResponseEntity<?> handleException(AlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler(UnauthorizedException.class)
    public static ResponseEntity<?> handleException(UnauthorizedException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(exception.getMessage());
    }

    @ExceptionHandler({MethodArgumentNotValidException.class, ConstraintViolationException.class})
    public static ResponseEntity<?> handleException(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public static ResponseEntity<?> handleException(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
    }
}












