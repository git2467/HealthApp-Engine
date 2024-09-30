package com.healthapp.engine;

import com.healthapp.engine.objects.FoodDiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface FoodDiaryRepository extends JpaRepository<FoodDiary, Long> {

    @Query("SELECT fd FROM FoodDiary fd WHERE fd.keycloakId = :keycloakId")
    public List<FoodDiary> findFoodDiaryById(
            @Param("keycloakId") String keycloakId
    );
}
