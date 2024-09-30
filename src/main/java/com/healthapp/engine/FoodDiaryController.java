package com.healthapp.engine;

import com.healthapp.engine.objects.FoodDiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class FoodDiaryController {

    @Autowired
    FoodDiaryService foodDiaryService;

    @GetMapping("/id")
    private List<FoodDiary> getFoodDiaryById(@RequestParam String keycloakId) {
        return foodDiaryService.getFoodDiaryById(keycloakId);
    }

    @PostMapping("/entry/create")
    private FoodDiary createEntry(@RequestBody FoodDiary foodDiary) {
        return foodDiaryService.createEntry(foodDiary);
    }
}
