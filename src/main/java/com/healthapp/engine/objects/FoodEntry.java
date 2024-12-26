package com.healthapp.engine.objects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "food_diary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column(name = "keycloak_id")
    String keycloakId;

    @Column(name = "fdc_id")
    String fdcId;

    @Column(name = "food_date")
    Date foodDate;

    @Column(name = "food_meal")
    String foodMeal;

    @Column(name = "food_name")
    String foodName;

    @Column(name = "food_serving_qty")
    double foodServingQty;

    @Column(name = "food_serving_size_unit_value")
    double foodServingSizeUnitValue;

    @Column(name = "food_serving_size_unit")
    String foodServingSizeUnit;

    @Column(name = "food_serving_size_gram_value")
    double foodServingSizeGramValue;

    @Column(name = "created_on")
    Date createdOn;
}
