package com.evergent.corejava.aarthi.application5;

import java.util.HashSet;
import java.util.Set;

public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;
    private String name;

    private static final Set<String> VALID_NAMES = new HashSet<>();
    
    static {
        VALID_NAMES.add("Aarthi");
        VALID_NAMES.add("Rachakonda");
    }

    @Override
    public void registerAccount(String name, int age) throws NotValidAge, NotValidName {
        this.name = name;
        this.age = age;

        if (!isValidName(name)) {
            throw new NotValidName("Invalid name. Registration failed.");
        }
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            throw new NotValidAge("Sorry, Age must be greater than 12 to register as an adult!!!");
        }
    }

    @Override
    public void requestBook(String btype) throws NotEligibleForThisBook {
        this.bookType = btype;

        if ("Fiction".equalsIgnoreCase(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 7 days!");
        } else {
            throw new NotEligibleForThisBook("Oops, you are allowed to take only adult Fiction books!!!");
        }
    }

    private boolean isValidName(String name) {
        return VALID_NAMES.contains(name);
    }
}


