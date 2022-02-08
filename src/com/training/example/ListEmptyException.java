package com.training.example;
import java.lang.Exception;

public class ListEmptyException extends Exception {
    public String toString() {
        return "La liste est vide";
    }
}
