package org.schoolwebsite.website.controller;

import org.schoolwebsite.website.model.Event;
import org.schoolwebsite.website.model.Announcement;
import org.schoolwebsite.website.repository.EventRepository;
import org.schoolwebsite.website.repository.AnnouncementRepository;
import org.schoolwebsite.website.repository.UserRepository;
import org.schoolwebsite.website.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AnnouncementRepository announcementRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        List<Event> events = eventRepository.findAll();
        List<Announcement> announcements = announcementRepository.findAll();
        model.addAttribute("events", events);
        model.addAttribute("announcements", announcements);

        if (userDetails != null) {
            User user = userRepository.findByUsername(userDetails.getUsername()).orElse(null);
            if (user != null) {
                model.addAttribute("role", user.getRole());
            }
        }
        return "index";
    }
}
