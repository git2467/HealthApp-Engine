CREATE TABLE food_diary (
    id SERIAL PRIMARY KEY,
    keycloak_id varchar(255),
    fdc_id varchar(255),
    food_date date without time zone,
    food_meal varchar(255),
    food_name varchar(255),
    food_serving int,
    food_serving_size_description varchar(255),
    food_serving_size_value float,
    created_on timestamp without time zone
    );


--INSERT INTO food_diary (keycloak_id, fdc_id, food_date, food_meal, food_name, 
--    food_serving, food_serving_size_description, food_serving_size_value, created_on)
--VALUES
--('user123', 'fdc789', '2024-09-27', 'breakfast', 'Greek Yogurt', 1, 'cup', 0.5, '2024-09-27 08:15:30'),
--('user124', 'fdc790', '2024-09-27', 'lunch', 'Grilled Chicken Salad', 1, 'grams', 200, '2024-09-27 13:20:45'),
--('user125', 'fdc791', '2024-09-27', 'dinner', 'Salmon Fillet', 2, 'grams', 300, '2024-09-27 19:05:10'),
--('user126', 'fdc792', '2024-09-28', 'breakfast', 'Oatmeal', 1, 'cup', 1.0, '2024-09-28 07:45:00'),
--('user127', 'fdc793', '2024-09-28', 'lunch', 'Chicken Wrap', 1, 'wrap', 1, '2024-09-28 12:30:15'),
--('user128', 'fdc794', '2024-09-28', 'dinner', 'Spaghetti Bolognese', 1, 'grams', 250, '2024-09-28 18:55:22'),
--('user129', 'fdc795', '2024-09-29', 'breakfast', 'Pancakes', 3, 'pancake', 3, '2024-09-29 09:10:05'),
--('user130', 'fdc796', '2024-09-29', 'lunch', 'Caesar Salad', 1, 'grams', 150, '2024-09-29 13:45:30'),
--('user131', 'fdc797', '2024-09-29', 'dinner', 'Beef Stir Fry', 2, 'grams', 300, '2024-09-29 20:00:00'),
--('user132', 'fdc798', '2024-09-29', 'snack', 'Apple Slices', 1, 'slice', 1, '2024-09-29 15:25:10');


--INSERT INTO food_diary (keycloak_id, fdc_id, food_date, food_meal, food_name, food_serving, food_serving_size_description, food_serving_size_value, created_on)
--VALUES
--('user123', 'fdc801', '2024-09-29', 'breakfast', 'Greek Yogurt', 1, 'cup', 0.5, '2024-09-29 08:10:00'),
--('user123', 'fdc802', '2024-09-29', 'lunch', 'Turkey Sandwich', 1, 'sandwich', 1, '2024-09-29 12:45:00'),
--('user123', 'fdc803', '2024-09-29', 'dinner', 'Grilled Salmon', 2, 'grams', 250, '2024-09-29 19:15:00'),
--('user123', 'fdc804', '2024-09-29', 'snack', 'Almonds', 1, 'grams', 50, '2024-09-29 15:00:00');


--SELECT * FROM food_diary WHERE keycloak_id = 'user123';

SELECT * FROM food_diary WHERE keycloak_id = 'user200' AND food_date = '2024-09-26';

SELECT * FROM food_diary WHERE keycloak_id = 'user200' AND food_date BETWEEN '2024-09-26 00:00:00' AND '2024-09-26 23:59:59';










