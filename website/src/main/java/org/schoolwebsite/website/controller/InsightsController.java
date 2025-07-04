package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.service.InsightsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import java.util.Map;

@RestController
@RequestMapping("/insights")
public class InsightsController {
    private final InsightsService service;

    public InsightsController(InsightsService service) { this.service = service; }

    @GetMapping("/principal/subject-averages")
    @PreAuthorize("hasRole('PRINCIPAL')")
    public Map<String, Double> getSubjectAverages() {
        return service.getAverageMarksBySubject();
    }
}
