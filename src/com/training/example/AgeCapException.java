package com.training.example;

public class AgeCapException extends Exception{
    private int guess;
    public AgeCapException(int guess) {
        this.guess = guess;
    }
    public String toString() {
        return this.guess + " n'est pas un âge valide";
    }
}
