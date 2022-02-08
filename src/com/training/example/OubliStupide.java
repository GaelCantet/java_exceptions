package com.training.example;

public class OubliStupide {
    public static void main(String[] args) {
        int[] tab = null;
        try {
            System.out.println(tab[2]);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
