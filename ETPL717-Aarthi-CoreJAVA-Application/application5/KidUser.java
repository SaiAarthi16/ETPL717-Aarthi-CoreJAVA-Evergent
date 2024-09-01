package com.evergent.corejava.aarthi.application5;

import java.util.HashSet;
import java.util.Set;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;
    private String name;

    private static final Set<String> VALID_NAMES = new HashSet<>();
    
    static {
        VALID_NAMES.add("Chutki");
        VALID_NAMES.add("Raju");
        VALID_NAMES.add("Jaggu");
    }

    @Override
    public void registerAccount(String name, int age) throws NotValidAge, NotValidName {
        this.name = name;
        this.age = age;

        if (!isValidName(name)) {
            throw new NotValidName("Invalid name. Registration failed.");
        }
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            throw new NotValidAge("Sorry, Age must be less than 12 to register as a kid!!!");
        }
    }

    @Override
    public void requestBook(String btype) throws NotEligibleForThisBook {
        this.bookType = btype;

        if ("Kids".equalsIgnoreCase(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days!");
        } else {
            throw new NotEligibleForThisBook("Oops, you are allowed to take only kids books!!!");
        }
    }

    private boolean isValidName(String name) {
        return VALID_NAMES.contains(name);
    }
}

