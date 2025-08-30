package com.auth.Authentication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { UsernameNotFoundException.class })
    protected ResponseEntity<Object> handleIllegalArgument(UsernameNotFoundException ex, WebRequest request) {
        String errorMessage = "Error: " + ex.getMessage();
        return handleExceptionInternal(ex, errorMessage, 
            new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}