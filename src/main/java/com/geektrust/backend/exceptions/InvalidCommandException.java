package com.geektrust.backend.exceptions;

public class InvalidCommandException extends RuntimeException {
    public  InvalidCommandException( String msg){
        super(msg);
    }
}
