package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.model.Announcement;
import org.schoolwebsite.website.repository.AnnouncementRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import java.util.List;

@RestController
@RequestMapping("/announcements")
public class AnnouncementController {
    private final AnnouncementRepository repo;

    public AnnouncementController(AnnouncementRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Announcement> getAll() { return repo.findAll(); }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','PRINCIPAL')")
    public Announcement create(@RequestBody Announcement ann) { return repo.save(ann); }
}
