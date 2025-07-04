package org.schoolwebsite.website.repository;

import org.schoolwebsite.website.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {}
