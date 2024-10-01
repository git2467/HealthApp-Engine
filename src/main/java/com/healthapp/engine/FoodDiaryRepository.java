package com.healthapp.engine;

import com.healthapp.engine.objects.FoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

interface FoodDiaryRepository extends JpaRepository<FoodEntry, Long> {

    @Query("SELECT fe FROM FoodEntry fe WHERE fe.keycloakId = :keycloakId")
    public List<FoodEntry> findFoodEntryById(
            @Param("keycloakId") String keycloakId
    );

    @Query("SELECT fe FROM FoodEntry fe WHERE fe.keycloakId = :keycloakId " +
            "AND fe.foodDate BETWEEN :startDate AND :endDate")
    public List<FoodEntry> findFoodEntryByDate(
            @Param("keycloakId") String keycloakId,
            @Param("startDate") LocalDateTime startDateTime,
            @Param("endDate") LocalDateTime endDateTime
    );

}
