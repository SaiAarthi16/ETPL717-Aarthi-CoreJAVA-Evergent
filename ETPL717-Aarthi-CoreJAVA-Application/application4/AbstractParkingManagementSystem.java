package com.evergent.corejava.aarthi.application4;

public abstract class AbstractParkingManagementSystem {
	 enum Module {
	        P, PA, R, Q
	    }

	    enum SubmoduleParking {
	        A, S, M
	    }

	    enum SubmodulePayment {
	        C, P, M
	    }

	    enum SubmoduleReport {
	        I, S, M
	    }

	    static String vehicleType = "";
	    static int hourlyChargeTwoWheeler = 25;
	    static int hourlyChargeThreeWheeler = 50;
	    static int hourlyChargeFourWheeler = 75;
	    static int hourlyChargeOthers = 100;
	    static int hours = 0;
	    static int cleaningCharge = 500;
	    static int repairingCharge = 1000;
	    static int modifyingCharge = 1500;
	    static double totalRevenue = 0;
	    static double totalServiceCharges = 0;
	    static double taxRate = 0.10;
	    static double Amount = 0;
	    static double TotalTax = 0;
	    static double TotalPayment = 0;
	    
	    public AbstractParkingManagementSystem(int hourlyChargeTwoWheeler, int hourlyChargeThreeWheeler, int hourlyChargeFourWheeler, 
                int hourlyChargeOthers, int cleaningCharge, int repairingCharge, int modifyingCharge, 
                double taxRate) {
	    	this.vehicleType = "";
	    	this.hourlyChargeTwoWheeler = hourlyChargeTwoWheeler;
	    	this.hourlyChargeThreeWheeler = hourlyChargeThreeWheeler;
	    	this.hourlyChargeFourWheeler = hourlyChargeFourWheeler;
	    	this.hourlyChargeOthers = hourlyChargeOthers;
	    	this.hours = 0;
	    	this.cleaningCharge = cleaningCharge;
	    	this.repairingCharge = repairingCharge;
	    	this.modifyingCharge = modifyingCharge;
	    	this.totalRevenue = 0;
	    	this.totalServiceCharges = 0;
	    	this.taxRate = taxRate;
	    	this.Amount = 0;
	    	this.TotalTax = 0;
	    	this.TotalPayment = 0;
	    }

	    abstract void processParkingModule();

	    abstract void processPaymentModule();

	    abstract void processReportModule();
	}
