package org.schoolwebsite.website.service;

import org.schoolwebsite.website.model.Marks;
import org.schoolwebsite.website.repository.MarksRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class InsightsService {
    private final MarksRepository marksRepo;

    public InsightsService(MarksRepository marksRepo) { this.marksRepo = marksRepo; }

    public Map<String, Double> getAverageMarksBySubject() {
        List<Marks> allMarks = marksRepo.findAll();
        Map<String, List<Integer>> subjectToMarks = new HashMap<>();
        for (Marks m : allMarks) {
            subjectToMarks.computeIfAbsent(m.getSubject(), k -> new ArrayList<>()).add(m.getMarks());
        }
        Map<String, Double> averages = new HashMap<>();
        for (var entry : subjectToMarks.entrySet()) {
            averages.put(entry.getKey(),
                    entry.getValue().stream().mapToInt(i -> i).average().orElse(0.0));
        }
        return averages;
    }
}
