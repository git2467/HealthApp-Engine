package com.healthapp.engine;

import com.healthapp.engine.objects.FoodDiary;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
class FoodDiaryService {

    @Autowired
    FoodDiaryRepository foodDiaryRepository;

    public List<FoodDiary> getFoodDiaryById(String keycloakId) {
        return foodDiaryRepository.findFoodDiaryById(keycloakId);
    }

    @Transactional
    public FoodDiary createEntry(FoodDiary foodDiary) {
        return foodDiaryRepository.save(foodDiary);
    }

}
