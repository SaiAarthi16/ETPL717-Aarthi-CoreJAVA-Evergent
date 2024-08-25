package com.evergent.corejava.aarthi.application4;
import java.util.*;

//IS-A relation (Inheritance) and Interface
public class ParkingManagementSystem extends AbstractParkingManagementSystem implements Modules{

	// Constructor that initializes the superclass with specific values
    public ParkingManagementSystem() {
        super(15, 20, 25, 30, 500, 1000, 1500, 0.10);
    }

    public void ParkingModule() {
        processParkingModule();
    }
   
    public void PaymentModule() {
        processPaymentModule();
    }

    public void ReportModule() {
        processReportModule();
    }

    @Override
    void processParkingModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("Parking Module");
        System.out.println("======================");
        System.out.println("A-Add Vehicle Type");
        System.out.println("S-Add Services");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Submodule code (A,S,M) : ");
        String module = br.nextLine();
        switch (SubmoduleParking.valueOf(module)) {
            case A:
                System.out.println("Add Vehicle Type:");
                System.out.println("0 - Two-Wheeler (Charge: Rs15/hr)");
                System.out.println("1 - Three-Wheeler (Charge: Rs20/hr)");
                System.out.println("2 - Four-Wheeler (Charge: Rs25/hr)");
                System.out.println("3 - Others (Charge: Rs30/hr)");
                System.out.println("Choose vehicle type index (0,1,2,3): ");
                int vehicleTypeIndex = Integer.parseInt(br.nextLine());
                int chargePerHour = 0;
                if (vehicleTypeIndex == 0) {
                    chargePerHour = hourlyChargeTwoWheeler;
                    vehicleType = "Two-Wheeler";
                } else if (vehicleTypeIndex == 1) {
                    chargePerHour = hourlyChargeThreeWheeler;
                    vehicleType = "Three-Wheeler";
                } else if (vehicleTypeIndex == 2) {
                    chargePerHour = hourlyChargeFourWheeler;
                    vehicleType = "Four-Wheeler";
                } else if (vehicleTypeIndex == 3) {
                    chargePerHour = hourlyChargeOthers;
                    vehicleType = "Others";
                }
                System.out.println("Enter number of hours parked: ");
                hours = Integer.parseInt(br.nextLine());
                double fee = chargePerHour * hours;
                totalRevenue += fee;
                System.out.println("Parking Fee for " + vehicleType + " for " + hours + " hours is Rs" + fee);
                break;
            case S:
                System.out.println("Select Services:");
                System.out.println("1 - Cleaning (Rs500)");
                System.out.println("2 - Repairing (Rs1000)");
                System.out.println("3 - Modifying (Rs1500)");
                System.out.println("Choose service type (1,2,3): ");
                int serviceType = Integer.parseInt(br.nextLine());
                int serviceCharge = 0;
                if (serviceType == 1) {
                    serviceCharge = cleaningCharge;
                } else if (serviceType == 2) {
                    serviceCharge = repairingCharge;
                } else if (serviceType == 3) {
                    serviceCharge = modifyingCharge;
                }
                totalServiceCharges += serviceCharge;
                System.out.println("Service Charge added: Rs" + serviceCharge);
                break;
            case M:
                break;
        }
    }

    @Override
    void processPaymentModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("C-Calculate Total Payment");
        System.out.println("P-Make Payment");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Submodule code (C,P,M) : ");
        String module = br.nextLine();
        Amount = totalRevenue + totalServiceCharges;
        TotalTax = Amount * taxRate;
        TotalPayment = Amount + TotalTax;
        switch (SubmodulePayment.valueOf(module)) {
            case C:
                System.out.println("Total Fee: Rs" + Amount);
                System.out.println("Tax: Rs" + TotalTax);
                System.out.println("Total Amount to be Paid: Rs" + TotalPayment);
                break;
            case P:
                System.out.println("To Make Payment");
                System.out.println("======================");
                System.out.println("Amount Due: Rs" + TotalPayment);
                break;
            case M:
                break;
        }
    }

  
    final void processReportModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I-Generate Invoice");
        System.out.println("S-Generate Summary");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Submodule code (I,S,M) : ");
        String module = br.nextLine();
        Amount = totalRevenue + totalServiceCharges;
        TotalTax = Amount * taxRate;
        TotalPayment = Amount + TotalTax;
        switch (SubmoduleReport.valueOf(module)) {
            case I:
                System.out.println("Invoice");
                System.out.println("======================");
                System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
                System.out.println("Your selected Type of Vehicle : " + vehicleType);
                System.out.println("Total Amount : Rs" + (Amount + TotalTax));
                break;
            case S:
                System.out.println("Summary Report");
                System.out.println("======================");
                System.out.println("Your selected Type of Vehicle : " + vehicleType);
                System.out.println("Your selected number of hours for Parking : " + hours);
                System.out.println("Total Parking Charges: Rs" + totalRevenue);
                System.out.println("Total Service Charges: Rs" + totalServiceCharges);
                System.out.println("Total Amount : Rs" + Amount);
                System.out.println("Total Tax: Rs" + TotalTax);
                System.out.println("Total Payment to be paid: Rs" + TotalPayment);
                break;
            case M:
                break;
        }
    }
}
