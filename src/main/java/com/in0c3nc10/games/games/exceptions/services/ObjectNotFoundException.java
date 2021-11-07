package com.in0c3nc10.games.games.exceptions.services;

public class ObjectNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID=1L;

    // ..construtor que recebe a mensagem de erro
    public ObjectNotFoundException(String message) {
        super(message);
    }

    // ..construtor que recebe a mensagem e a causa de erro
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
