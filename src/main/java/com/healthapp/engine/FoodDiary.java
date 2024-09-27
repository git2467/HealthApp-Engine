package com.healthapp.engine;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Entity
class FoodDiary {

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

    @Column(name = "food_qty")
    int foodQty;

    @Column(name = "created_on")
    String createdOn;
}
