package com.training.example;

public class AgeCapException extends Exception{
    public String toString() {
        return "L'âge doit être compris entre 18 et 65 ans";
    }
}
