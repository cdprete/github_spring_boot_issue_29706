package com.cdprete.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author Cosimo Damiano Prete
 * @since 09/02/2022
 */
@ControllerAdvice
class DemoExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        var code = "invalid.input.data";
        var defaultMessage = "Some input data were invalid. Please check the logs for further details.";
        return new ResponseEntity<>(new ErrorResponse(code, defaultMessage), BAD_REQUEST);
    }

    private record ErrorResponse(String code, String defaultMessage) {

    }
}
