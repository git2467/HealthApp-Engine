package com.healthapp.engine;

import com.healthapp.engine.objects.FoodDiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class FoodDiaryService {

    @Autowired
    FoodDiaryRepository foodDiaryRepository;

    public List<FoodDiary> getFoodDiaryById(String keycloakId) {
        return foodDiaryRepository.findFoodDiaryById(keycloakId);
    }

}
