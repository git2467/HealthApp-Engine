package com.healthapp.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class FoodDiaryController {

    @Autowired
    FoodDiaryService foodDiaryService;

    @GetMapping("/id")
    List<FoodDiary> getUsersById(@RequestParam String keycloakId) {
        System.out.println(foodDiaryService.getFoodDiaryById(keycloakId));
        return foodDiaryService.getFoodDiaryById(keycloakId);
    }
}
