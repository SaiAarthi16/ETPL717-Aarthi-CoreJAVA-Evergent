package com.evergent.pms.dao;
import com.evergent.pms.bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    private Connection connection;

    public PatientDAO(Connection connection) {
        this.connection = connection;
    }

    public int registerPatient(PatientBean patient) {
        try {
            String sql = "INSERT INTO patients (patient_id, patient_name, mobile_number) VALUES (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, patient.getPatientId());
            pstmt.setString(2, patient.getPatientName());
            pstmt.setLong(3, patient.getMobileNumber());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<PatientBean> getAllPatients() {
        List<PatientBean> patients = new ArrayList<>();
        try {
            String sql = "SELECT * FROM patients";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                PatientBean patient = new PatientBean();
                patient.setPatientId(rs.getInt("patient_id"));
                patient.setPatientName(rs.getString("patient_name"));
                patient.setMobileNumber(rs.getLong("mobile_number"));
                patients.add(patient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patients;
    }

    public void addMedicalHistory(int patientId, PatientBean.Visit visit) {
        try {
            String sql = "INSERT INTO medical_history (patient_id, visit_date, concern) VALUES (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, patientId);
            pstmt.setString(2, visit.getVisitDate());
            pstmt.setString(3, visit.getConcern());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<PatientBean.Visit> getMedicalHistory(int patientId) {
        List<PatientBean.Visit> history = new ArrayList<>();
        try {
            String sql = "SELECT visit_date, concern FROM medical_history WHERE patient_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, patientId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                history.add(new PatientBean.Visit(rs.getString("visit_date"), rs.getString("concern")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return history;
    }
}
