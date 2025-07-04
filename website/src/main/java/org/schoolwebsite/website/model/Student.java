package org.schoolwebsite.website.model;

import jakarta.persistence.*;
import java.util.Map;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String admittedInto;
    private String previousClass;

    @ElementCollection
    private Map<String, Integer> previousMarks; // subject: marks

    public Student() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAdmittedInto() { return admittedInto; }
    public void setAdmittedInto(String admittedInto) { this.admittedInto = admittedInto; }
    public String getPreviousClass() { return previousClass; }
    public void setPreviousClass(String previousClass) { this.previousClass = previousClass; }
    public Map<String, Integer> getPreviousMarks() { return previousMarks; }
    public void setPreviousMarks(Map<String, Integer> previousMarks) { this.previousMarks = previousMarks; }
}
