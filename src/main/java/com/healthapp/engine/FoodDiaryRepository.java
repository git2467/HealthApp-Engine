package com.healthapp.engine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface FoodDiaryRepository extends JpaRepository<FoodDiary, Long> {

    // JPQL Query with complex filtering
    @Query("select * from food_diary where keycloak_id = '123'")
    List<FoodDiary> findById(
            @Param("keycloakId") String keycloakId
    );

//    List<FoodDiary> findById(String keycloakId);
}
