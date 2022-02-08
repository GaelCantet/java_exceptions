package com.training.example;

import java.util.*;
import com.training.example.ListEmptyException;

public class Main {

    static final String LOGIN = "scott";
    static final String PWD = "tiger";

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

    public static void getAgeCap() throws Exception {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Quel est l'âge du capitaine ?");
            int guess = scan.nextInt();
            if (guess < 18 || guess > 65) {
                throw new AgeCapException(guess);
            } else {
                System.out.println("L'âge du capitaine est " + guess);
            }
        } catch (InputMismatchException e) {
            throw new Exception("L'âge doit être un entier");
        }
    }

    public static void login() throws Exception, WrongInputLength, WrongLoginException, WrongPwdException {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Login :");
            String login = scan.nextLine();
            System.out.println("Password :");
            String pwd = scan.nextLine();
            if (pwd.length() > 10 || login.length() > 10) {
                throw new WrongInputLength();
            } else if (!login.equals(LOGIN)) {
                throw new WrongLoginException();
            } else if (!pwd.equals(PWD)) {
                throw new WrongPwdException();
            } else {
                System.out.println("Login et mot de passe corrects");
            }
        } catch (Exception e) {
            throw new Exception("Merci de saisir une chaine de caractères");
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

//        boolean isOk = false;
//        int nbEssais = 0;
//        while (!isOk) {
//            try {
//                getAgeCap();
//                isOk = true;
//            } catch (Exception e) {
//                nbEssais++;
//                System.out.println(e.toString());
//            }
//        }

        boolean isOk = false;
        while (!isOk) {
            try {
                login();
                isOk = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
