package org.schoolwebsite.website.repository;

import org.schoolwebsite.website.model.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepository extends JpaRepository<Admission, Long> {}
