package com.evergent.pms.controller;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import com.evergent.pms.bean.PatientBean;
import com.evergent.pms.dao.PatientDBConnection;
import com.evergent.pms.service.PatientService;

public class PatientController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = PatientDBConnection.getConnection();
            PatientService patientService = new PatientService(connection);
            int choice;

            do {
                System.out.println("------------------------WELCOME TO THE MEDICAL SYSTEM---------------------");
                System.out.println("1. Register New Patient");
                System.out.println("2. Show Patient Details");
                System.out.println("3. Update Medical History");
                System.out.println("4. Show All Patients");
                System.out.println("5. Show All Medical History");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: // Register New Patient
                        registerNewPatient(scanner, patientService);
                        break;
                    case 2: // Show Patient Details
                        showPatientDetails(scanner, patientService);
                        break;
                    case 3: // Update Medical History
                        updateMedicalHistory(scanner, patientService);
                        break;
                    case 4: // Show All Patients
                        showAllPatients(patientService);
                        break;
                    case 5: // Show All Medical History
                        showAllMedicalHistory(scanner, patientService);
                        break;
                    case 0: // Exit
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        } catch (Exception e) {
                    e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            scanner.close();
        }
    }

    private static void registerNewPatient(Scanner scanner, PatientService patientService) {
        System.out.println("Enter Patient ID:");
        int patientId = scanner.nextInt();
        System.out.println("Enter Patient Name:");
        String patientName = scanner.next();
        System.out.println("Enter Mobile Number:");
        long mobileNumber = scanner.nextLong();

        PatientBean patientBean = new PatientBean();
        patientBean.setPatientId(patientId);
        patientBean.setPatientName(patientName);
        patientBean.setMobileNumber(mobileNumber);

        int result = patientService.registerPatient(patientBean);
        System.out.println(result + " Patient registered successfully.");
    }

    private static void showPatientDetails(Scanner scanner, PatientService patientService) {
        System.out.println("Enter Patient ID to show details:");
        int patientId = scanner.nextInt();
        // Logic to fetch and display patient details
        List<PatientBean> patients = patientService.getAllPatients();
        for (PatientBean patient : patients) {
            if (patient.getPatientId() == patientId) {
                System.out.println("Patient Name: " + patient.getPatientName());
                System.out.println("Mobile Number: " + patient.getMobileNumber());
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    private static void updateMedicalHistory(Scanner scanner, PatientService patientService) {
        System.out.println("Enter Patient ID to update medical history:");
        int patientId = scanner.nextInt();

        System.out.println("Enter visit date (YYYY-MM-DD):");
        String visitDate = scanner.next();
        System.out.println("Enter concern:");
        String concern = scanner.next();
        PatientBean.Visit newVisit = new PatientBean.Visit(visitDate, concern);
        patientService.addMedicalHistory(patientId, newVisit);
        System.out.println("Visit added: " + newVisit);
    }

    private static void showAllPatients(PatientService patientService) {
        List<PatientBean> patients = patientService.getAllPatients();
        System.out.println("Patients List:");
        for (PatientBean patient : patients) {
            System.out.println("ID: " + patient.getPatientId() + ", Name: " + patient.getPatientName());
        }
    }

    private static void showAllMedicalHistory(Scanner scanner, PatientService patientService) {
        System.out.println("Enter Patient ID to show medical history:");
        int patientId = scanner.nextInt();
        List<PatientBean.Visit> medicalHistory = patientService.getMedicalHistory(patientId);
        if (medicalHistory.isEmpty()) {
            System.out.println("No medical history found for Patient ID " + patientId);
        } else {
            System.out.println("Medical History for Patient ID " + patientId + ":");
            for (PatientBean.Visit visit : medicalHistory) {
                System.out.println(visit);
            }
        }
    }
}