package org.schoolwebsite.website.model;

import jakarta.persistence.*;

@Entity
public class Admission {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Student student;

    private String status; // PENDING, APPROVED, REJECTED

    public Admission() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
