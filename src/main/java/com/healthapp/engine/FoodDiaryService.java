package com.healthapp.engine;

import com.healthapp.engine.objects.FoodEntry;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
@Getter
@Setter
class FoodDiaryService {

    @Autowired
    FoodDiaryRepository foodDiaryRepository;

    public List<FoodEntry> findFoodEntryById(String keycloakId) {
        return foodDiaryRepository.findFoodEntryById(keycloakId);
    }

    public List<FoodEntry> findFoodEntryByDate(String keycloakId, String startDate, String endDate) {
        // Define the date format pattern (e.g., "yyyy-MM-dd HH:mm:ss" for full date-time string)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Convert startDate and endDate strings to LocalDateTime
        LocalDateTime startDateTime = LocalDateTime.parse(startDate, formatter);
        LocalDateTime endDateTime = LocalDateTime.parse(endDate, formatter);

        return foodDiaryRepository.findFoodEntryByDate(keycloakId, startDateTime, endDateTime);
    }

    @Transactional
    public FoodEntry saveEntry(FoodEntry foodEntry) {
        return foodDiaryRepository.save(foodEntry);
    }

    @Transactional
    public void deleteEntry(String id) {
        Long longId = Long.parseLong(id);
        foodDiaryRepository.deleteById(longId);
    }

}
