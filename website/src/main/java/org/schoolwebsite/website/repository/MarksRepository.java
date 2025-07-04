package org.schoolwebsite.website.repository;

import org.schoolwebsite.website.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MarksRepository extends JpaRepository<Marks, Long> {
    List<Marks> findByStudentId(Long studentId);
    List<Marks> findBySubject(String subject);
}
