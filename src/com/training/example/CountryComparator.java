package com.training.example;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

    public int compare(Country c1, Country c2) {

        if (c1.getName().length() > c2.getName().length()) {
            return 1;
        } else if (c1.getName().length() == c2.getName().length()) {
            return 0;
        } else {
            return -1;
        }
    }
}
