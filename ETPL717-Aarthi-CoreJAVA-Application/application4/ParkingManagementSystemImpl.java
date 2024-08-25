package com.evergent.corejava.aarthi.application4;
import java.util.*;

public class ParkingManagementSystemImpl {
	
	//static block
	static {
        System.out.println("\n\t Welcome To PARKING MANAGEMENT SYSTEM");
    }
	
    public static void main(String[] args){
    	
    	// HAS-A relation
        ParkingManagementSystem parkingSystem = new ParkingManagementSystem();
        Scanner br = new Scanner(System.in);
        while (true) {
            System.out.println("======================");
            System.out.println("PMS Main Menu");
            System.out.println("======================");
            System.out.println("P-Parking Module");
            System.out.println("PA-Payment Module");
            System.out.println("R-Report Module");
            System.out.println("Q-Quit Module");
            System.out.println("======================");
            System.out.println("Enter your Module code (P,PA,R,Q) : ");
            String moduleInput = br.nextLine();
            System.out.println("You entered the module: " + moduleInput);

            // Handle module selection
                AbstractParkingManagementSystem.Module module = AbstractParkingManagementSystem.Module.valueOf(moduleInput);
                switch (module) {
                    case P:
                        parkingSystem.ParkingModule();
                        break;
                    case PA:
                        parkingSystem.PaymentModule();
                        break;
                    case R:
                        parkingSystem.ReportModule();
                        break;
                    case Q:
                        System.out.println("Quit Module");
                        System.out.println("THANK YOU!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Module Code. Please try again.");
                        break;
                }
            } 
    }
}