package com.training.example;

public class WrongInputLength extends Exception{
    public String getMessage() {
        return "Le login ou le mot de passe est trop long";
    }
}
