package com.training.example;

import java.util.*;
import com.training.example.ListEmptyException;

public class Main {

    public static void showCollection(List countries) throws ListEmptyException {
//        try {
//            System.out.println(countries);
//            throw new ListEmptyException();
//        } catch (ListEmptyException e) {
//            e.printStackTrace();
//        }

        if (countries.isEmpty()) {
            throw new ListEmptyException();
        } else {
            System.out.println("La collection contient " + countries.size() + " pays !");
            for (Iterator<Country> iterator = countries.iterator(); iterator.hasNext(); ) {
                System.out.println(iterator.next().getName());
            }
        }

//        try {
//            for (Iterator<Country> iterator = collection.iterator(); iterator.hasNext(); ) {
//                System.out.println(iterator.next().getName());
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void getAgeCap(Scanner scan) throws Exception {
        System.out.println("Quel est l'âge du capitaine ?");
        try {
            int guess = scan.nextInt();
            if (guess < 18 || guess > 65) {
                throw new AgeCapException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        List<Country> countries = new ArrayList<Country>();
//        countries.add(new Country("France"));
//        countries.add(new Country("Allemagne"));
//        countries.add(new Country("USA"));
//        countries.add(new Country("Chine"));
//        Collections.sort(countries, new CountryComparator());
//        countries.clear();
//        try {
//            showCollection(countries);
//        } catch (ListEmptyException e) {
//            e.printStackTrace();
//        }
        Scanner scan = new Scanner(System.in);
        try {
            getAgeCap(scan);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
