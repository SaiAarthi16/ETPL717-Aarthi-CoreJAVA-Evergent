package com.evergent.collection.HashMap_CaseStudy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EmployeeManagementSystem {
	static {
		System.out.println("\t\t Weclome to Employee Management System\n");
	}
	static Scanner sc=new Scanner(System.in);
	static Map<Integer, Employee> employeeMap=new HashMap<>();
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("Choose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Retrieve employee details");
            System.out.println("3. Update employee information");
            System.out.println("4. Remove employee");
            System.out.println("5. List all employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            //String choice=sc.nextLine();
            int choice;
            try {
              // choice = Integer.parseInt(sc.nextLine());
              choice = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-6.");
                continue;
            }

            switch (choice) {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    retrieveEmployee();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    removeEmployee();
                    break;

                case 5:
                    displayEmployees();
                    break;
                    
                case 6:
                    System.out.println("Exiting....ThankYou:)");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
	}

	public static void addEmployee() {
		System.out.println("Enter the Employee Id : ");
		//int id = Integer.parseInt(sc.nextLine());
		int id=sc.nextInt();
		sc.nextLine();
		if(employeeMap.containsKey(id))
			System.out.println("Given ID already exists.");
		else {
		System.out.println("Enter the Employee Name : ");
		String name=sc.nextLine();
		System.out.println("Enter the Employee Department : ");
		String deptName=sc.nextLine();
		Employee emp=new Employee(id, name, deptName);
		employeeMap.put(id,emp);
        System.out.println("Added Employee details: " +emp); }
		
	}

	public static void retrieveEmployee() {
		System.out.println("Enter the Employee-ID to retrieve the details: ");
		int id=sc.nextInt();
		if(employeeMap.containsKey(id))
			System.out.println(employeeMap.get(id));
		else
			System.out.println("No Employee details found.");	
	}
	
	public static void updateEmployee() {
		System.out.println("Enter the Employee ID to update: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the updated Employee Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the updated Employee Department: ");
		String dept=sc.nextLine();
		if(employeeMap.containsKey(id)) {
			Employee q=new Employee(id,name,dept);
			employeeMap.put(id, q);
		}
		else {
			System.out.println("No Employee with ID-"+id+" is found.");
		}
	}
	public static void removeEmployee() {
		System.out.println("Enter the Employee ID to remove the employee: ");
		int id=sc.nextInt();	
		if(employeeMap.containsKey(id)) {
			employeeMap.remove(id);
		}
	}

	public static void displayEmployees() {
		if(employeeMap.isEmpty())
			System.out.println("No employees is found to display - Map is Empty! ");
		else {
			//System.out.println(employeeMap);
			for(Employee e:employeeMap.values()) {
				System.out.println(e);
			}
		}	
	}
}
