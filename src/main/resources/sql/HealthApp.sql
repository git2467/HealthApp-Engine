CREATE TABLE food_diary (
	id SERIAL PRIMARY KEY,
    keycloak_id varchar(255),
    fdc_id varchar(255),
    food_date date,
    food_meal varchar(255),
    food_name varchar(255),
    food_serving_qty float,
    food_serving_size_unit_value float,
    food_serving_size_unit varchar(255),
    food_serving_size_gram_value float,
    created_on timestamp
);
