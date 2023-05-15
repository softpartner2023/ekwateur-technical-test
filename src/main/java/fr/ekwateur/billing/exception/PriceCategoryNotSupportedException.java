package fr.ekwateur.billing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PriceCategoryNotSupportedException extends RuntimeException{

    public PriceCategoryNotSupportedException(String message) {
        super(message);
    }
}
