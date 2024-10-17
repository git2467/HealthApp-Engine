package com.healthapp.engine;

import com.healthapp.engine.objects.FoodEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
class FoodDiaryController {

    @Autowired
    FoodDiaryService foodDiaryService;

    //TODO: sort by date, weekly
    @GetMapping("/entry/id")
    private List<FoodEntry> getFoodEntryById(@RequestParam String keycloakId) {
        return foodDiaryService.findFoodEntryById(keycloakId);
    }

    @GetMapping("/entry/date")
    private List<FoodEntry> getFoodEntryByDate(@RequestParam String keycloakId, @RequestParam String foodDate ) {
        return foodDiaryService.findFoodEntryByDate(keycloakId, foodDate + " 00:00:00", foodDate + " 23:59:59");
    }

    @PostMapping("/entry/create")
    private FoodEntry createEntry(@RequestBody FoodEntry foodEntry) {
        return foodDiaryService.saveEntry(foodEntry);
    }

    @PutMapping("/entry/update")
    private FoodEntry updateEntry(@RequestBody FoodEntry foodEntry) {
        if(foodEntry.getId() == null){
            throw new IllegalArgumentException("Missing food entry id");
        }
        return foodDiaryService.saveEntry(foodEntry);
    }

    @DeleteMapping("/entry/delete")
    private void deleteEntry(@RequestBody String id) {
        foodDiaryService.deleteEntry(id);
    }

}
