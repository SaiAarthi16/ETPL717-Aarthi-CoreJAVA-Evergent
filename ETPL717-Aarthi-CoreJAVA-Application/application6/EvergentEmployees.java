package com.evergent.corejava.aarthi.application6;
import java.util.Scanner;

public class EvergentEmployees {
    static {
        System.out.println("\n\t Welcome To Evergent :)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeInterface emp = new EmployeeImpl();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Get All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            } 

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Designation: ");
                    String designation = sc.nextLine();
                    
                    Employee employee = new Employee();
                    employee.setIsId(id);
                    employee.setEmployeeName(name);
                    employee.setDesignation(designation);
                    
                    String result = emp.addEmployee(employee);
                    System.out.println(result);
                    break;
                
                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.nextLine();
                    emp.searchByEmpId(searchId);
                    break;
                
                case 3:
                    emp.getAllEmployees();
                    break;
                
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

