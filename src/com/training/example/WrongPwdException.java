package com.training.example;

public class WrongPwdException extends Exception{
    public String getMessage() {
        return "Le mot de passe est incorrect";
    }
}
