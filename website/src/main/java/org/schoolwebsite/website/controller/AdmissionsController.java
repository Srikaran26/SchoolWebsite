package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.dto.AdmissionForm;
import org.schoolwebsite.website.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
public class AdmissionsController {

    @Autowired
    private AdmissionService admissionService;

    @GetMapping("/admissions")
    public String showForm(Model model) {
        model.addAttribute("admissionForm", new AdmissionForm());
        return "admissions";
    }

    @PostMapping("/admissions/apply")
    public String submitForm(@Valid @ModelAttribute("admissionForm") AdmissionForm admissionForm,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "admissions";
        }
        admissionService.applyAdmission(admissionForm);
        model.addAttribute("successMessage", "Application submitted!");
        return "admissions";
    }
}
