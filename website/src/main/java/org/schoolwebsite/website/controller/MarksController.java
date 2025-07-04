package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.model.Marks;
import org.schoolwebsite.website.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarksController {
    @Autowired private MarksRepository marksRepo;

    @GetMapping("/student/{studentId}")
    @PreAuthorize("hasAnyRole('TEACHER','PRINCIPAL','STUDENT')")
    public List<Marks> getStudentMarks(@PathVariable Long studentId) {
        return marksRepo.findByStudentId(studentId);
    }

    @PostMapping("/add")
    @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
    public Marks addMarks(@RequestBody Marks marks) {
        return marksRepo.save(marks);
    }
}
