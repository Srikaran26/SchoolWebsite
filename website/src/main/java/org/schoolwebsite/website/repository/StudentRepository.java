package org.schoolwebsite.website.repository;

import org.schoolwebsite.website.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;



public interface StudentRepository extends JpaRepository<Student, Long> {}


