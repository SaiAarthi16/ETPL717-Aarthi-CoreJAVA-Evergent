package com.evergent.corejava.aarthi.application5;

public interface LibraryUser {
    void registerAccount(String name, int age) throws NotValidAge, NotValidName;
    void requestBook(String btype) throws NotEligibleForThisBook;
}

