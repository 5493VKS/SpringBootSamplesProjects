package com.in28minlearning.restservice_sb.jwt.resource;
public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

