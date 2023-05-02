package ru.rest.exception_handler;

public class NoSuchPetException extends RuntimeException {
    public NoSuchPetException(String message) {
        super(message);
    }
}
