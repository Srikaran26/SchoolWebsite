package org.schoolwebsite.website.service;

import org.schoolwebsite.website.model.*;
import org.schoolwebsite.website.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdmissionService {
    @Autowired private AdmissionRepository admissionRepo;
    @Autowired private StudentRepository studentRepo;

    public Admission applyAdmission(Student student) {
        studentRepo.save(student);
        Admission admission = new Admission();
        admission.setStudent(student);
        admission.setStatus("PENDING");
        return admissionRepo.save(admission);
    }

    public List<Admission> getAllAdmissions() {
        return admissionRepo.findAll();
    }

    public Admission updateStatus(Long id, String status) {
        Admission admission = admissionRepo.findById(id).orElseThrow();
        admission.setStatus(status);
        return admissionRepo.save(admission);
    }
}
