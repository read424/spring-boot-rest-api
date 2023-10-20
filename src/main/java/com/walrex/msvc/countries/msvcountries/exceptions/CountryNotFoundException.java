package com.walrex.msvc.countries.msvcountries.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(String message) {
        super(message);
    }
    public CountryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
