package com.healthapp.engine;

import com.healthapp.engine.objects.FoodDiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class FoodDiaryController {

    @Autowired
    FoodDiaryService foodDiaryService;

    @GetMapping("/id")
    private List<FoodDiary> getFoodDiaryById(@RequestParam String keycloakId) {
        return foodDiaryService.getFoodDiaryById(keycloakId);
    }
}
