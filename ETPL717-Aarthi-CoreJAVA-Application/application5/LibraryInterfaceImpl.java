package com.evergent.corejava.aarthi.application5;
import java.util.Scanner;
class NotValidName extends Exception {
    public NotValidName(String msg) {
        super(msg);
    }
}
class NotEligibleForThisBook extends Exception {
    public NotEligibleForThisBook(String msg) {
        super(msg);
    }
}
class NotValidAge extends Exception {
    public NotValidAge(String msg) {
        super(msg);
    }
}
public class LibraryInterfaceImpl {
	static {
		System.out.println("-----------LIBRARY----------");
		System.out.println();
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Display menu for user to choose between Kid and Adult
            System.out.println("Select your role:");
            System.out.println("1. Kid");
            System.out.println("2. Adult");

            // Read user choice
            int choice = Integer.parseInt(scanner.nextLine());

            // Handle user choice using switch case
            switch (choice) {
                case 1:
                    handleKidUser(scanner);
                    break;
                case 2:
                    handleAdultUser(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 for Kid or 2 for Adult.");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void handleKidUser(Scanner scanner) {
        KidUser kidUser = new KidUser();
        try {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Enter your age:");
            int age = Integer.parseInt(scanner.nextLine());

            kidUser.registerAccount(name, age);

            System.out.println("Enter the book type you want to request (e.g., 'Kids' or 'Fiction'):");
            String bookType = scanner.nextLine();
            kidUser.requestBook(bookType);
        } catch (NotValidName e) {
            System.out.println(e.getMessage());
        } catch (NotValidAge e) {
            System.out.println(e.getMessage());
        } catch (NotEligibleForThisBook e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a valid number.");
        }
    }

    private static void handleAdultUser(Scanner scanner) {
        AdultUser adultUser = new AdultUser();
        try {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Enter your age:");
            int age = Integer.parseInt(scanner.nextLine());

            adultUser.registerAccount(name, age);

            System.out.println("Enter the book type you want to request (e.g., 'Kids' or 'Fiction'):");
            String bookType = scanner.nextLine();
            adultUser.requestBook(bookType);
        } catch (NotValidName e) {
            System.out.println(e.getMessage());
        } catch (NotValidAge e) {
            System.out.println(e.getMessage());
        } catch (NotEligibleForThisBook e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a valid number.");
        }
    }
}
