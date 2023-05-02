package ru.rest.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

public class ControllerUtils {
    public static Map<String, String> getErrors(BindingResult result) {
        Map<String, String> errorsResult = new HashMap<>();
        if (result.hasErrors()) {
            for (FieldError fieldError : result.getFieldErrors()) {
                errorsResult.put(fieldError.getField() + "Error", fieldError.getDefaultMessage());
            }
        }
        return errorsResult;
    }
}
