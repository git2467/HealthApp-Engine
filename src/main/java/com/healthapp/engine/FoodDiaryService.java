package com.healthapp.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class FoodDiaryService {

    @Autowired
    FoodDiaryRepository foodDiaryRepository;

    List<FoodDiary> getFoodDiaryById(String keycloakId) {
        return foodDiaryRepository.findByKeyCloakId(keycloakId);
    }

}
