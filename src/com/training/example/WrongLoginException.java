package com.training.example;

public class WrongLoginException extends Exception{
    public String getMessage() {
        return "Le login est incorrect";
    }
}
