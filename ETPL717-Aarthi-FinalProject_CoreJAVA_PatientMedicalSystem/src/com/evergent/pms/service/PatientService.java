package com.evergent.pms.service;

import com.evergent.pms.bean.PatientBean;
import com.evergent.pms.dao.PatientDAO;

import java.sql.Connection;
import java.util.List;

public class PatientService {
    private PatientDAO patientDAO;

    public PatientService(Connection connection) {
        this.patientDAO = new PatientDAO(connection);
    }

    public int registerPatient(PatientBean patient) {
        return patientDAO.registerPatient(patient);
    }

    public List<PatientBean> getAllPatients() {
        return patientDAO.getAllPatients();
    }

    public void addMedicalHistory(int patientId, PatientBean.Visit visit) {
        patientDAO.addMedicalHistory(patientId, visit);
    }

    public List<PatientBean.Visit> getMedicalHistory(int patientId) {
        return patientDAO.getMedicalHistory(patientId);
    }
}