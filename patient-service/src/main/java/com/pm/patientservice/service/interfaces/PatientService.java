package com.pm.patientservice.service.interfaces;

import com.pm.patientservice.dto.request.PatientRequestDTO;
import com.pm.patientservice.dto.response.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    public List<PatientResponseDTO> getAllPatients();

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);

    public void deletePatient(UUID id);
}
