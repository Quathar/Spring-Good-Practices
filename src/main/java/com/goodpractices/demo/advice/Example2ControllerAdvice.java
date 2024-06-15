package com.goodpractices.demo.advice;

import com.goodpractices.demo.data.model.EntityNotFound;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.NoSuchElementException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class Example2ControllerAdvice {

    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<Map<String, ?>> handleEntityNotFound() {
        var body = Map.of(
                "status", NOT_FOUND.name(),
                "code",  NOT_FOUND.value(),
                "timestamp", java.time.LocalDateTime.now(),
                "message", "custom messages can be inserted here"
        );

        return ResponseEntity.status(NOT_FOUND).body(body);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(NOT_FOUND)
    public Map<String, ?> handleNoSuchElementException(NoSuchElementException e) {
        return Map.of(
                "status",    NOT_FOUND.name(),
                "code",      NOT_FOUND.value(),
                "timestamp", java.time.LocalDateTime.now(),
                "message",   e.getMessage()
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(BAD_REQUEST)
    public Map<String, ?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return Map.of(
                "status",    BAD_REQUEST.name(),
                "code",      BAD_REQUEST.value(),
                "timestamp", java.time.LocalDateTime.now(),
                "message",   e.getMessage()
        );
    }

}
