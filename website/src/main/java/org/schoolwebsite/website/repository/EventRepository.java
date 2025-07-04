package org.schoolwebsite.website.repository;

import org.schoolwebsite.website.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {}
