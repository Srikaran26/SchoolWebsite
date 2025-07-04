package org.schoolwebsite.website.dto;

import jakarta.validation.constraints.NotBlank;

public class AdmissionForm {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Admitted Into is required")
    private String admittedInto;

    @NotBlank(message = "Previous class is required")
    private String previousClass;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for admittedInto
    public String getAdmittedInto() {
        return admittedInto;
    }
    public void setAdmittedInto(String admittedInto) {
        this.admittedInto = admittedInto;
    }

    // Getter and Setter for previousClass
    public String getPreviousClass() {
        return previousClass;
    }
    public void setPreviousClass(String previousClass) {
        this.previousClass = previousClass;
    }
}
