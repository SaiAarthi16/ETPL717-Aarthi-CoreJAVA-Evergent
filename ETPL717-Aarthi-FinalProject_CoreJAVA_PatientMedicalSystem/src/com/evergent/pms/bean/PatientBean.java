package com.evergent.pms.bean;

import java.util.ArrayList;
import java.util.List;

public class PatientBean {
    private int patientId;
    private String patientName;
    private long mobileNumber;
    private List<Visit> medicalHistory;

    public PatientBean() {
        this.medicalHistory = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Visit> getMedicalHistory() {
        return medicalHistory;
    }

    public void addVisit(Visit visit) {
        this.medicalHistory.add(visit);
    }

    public static class Visit {
        private String visitDate;
        private String concern;

        public Visit(String visitDate, String concern) {
            this.visitDate = visitDate;
            this.concern = concern;
        }

        public String getVisitDate() {
            return visitDate;
        }

        public String getConcern() {
            return concern;
        }

        @Override
        public String toString() {
            return "Visit Date: " + visitDate + ", Concern: " + concern;
        }
    }
}
