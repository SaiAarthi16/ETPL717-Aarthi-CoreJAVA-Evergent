package com.evergent.corejava.aarthi.CaseStudy_Library;

public interface LibraryUser {
    void registerAccount(String name, int age) throws NotValidAge, NotValidName;
    void requestBook(String btype) throws NotEligibleForThisBook;
}

