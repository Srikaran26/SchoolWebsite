package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.model.Event;
import org.schoolwebsite.website.repository.EventRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventRepository repo;

    public EventController(EventRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Event> getAll() { return repo.findAll(); }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','PRINCIPAL')")
    public Event create(@RequestBody Event event) { return repo.save(event); }
}
