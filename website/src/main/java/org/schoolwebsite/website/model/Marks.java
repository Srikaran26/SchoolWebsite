package org.schoolwebsite.website.model;

import jakarta.persistence.*;

@Entity
public class Marks {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Student student;

    private String subject;
    private Integer marks;

    public Marks() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public Integer getMarks() { return marks; }
    public void setMarks(Integer marks) { this.marks = marks; }
}
