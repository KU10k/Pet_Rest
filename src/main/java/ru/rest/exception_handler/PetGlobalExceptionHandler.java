package ru.rest.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PetGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<IncorrectResponse> handleException(NoSuchPetException exception) {
        return getResponseEntity(exception, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<IncorrectResponse> handleException(Exception exception) {
        return getResponseEntity(exception, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<IncorrectResponse> getResponseEntity(Exception exception, HttpStatus status) {
        IncorrectResponse incorrectResponse = new IncorrectResponse();
        incorrectResponse.setInfo(exception.getMessage());
        return new ResponseEntity<>(incorrectResponse, status);
    }

}
