--CREATE TABLE food_diary (
--    id SERIAL PRIMARY KEY,
--    keycloak_id varchar(255),
--    fdc_id varchar(255),
--    food_date date,
--    food_meal varchar(255),
--    food_name varchar(255),
--    food_qty int,
--    created_on timestamp without time zone
--    );


--INSERT INTO food_diary (keycloak_id, fdc_id, food_date, food_meal, food_name, food_qty, created_on)
--VALUES
--('user123', 'fdc789', '2024-09-27', 'breakfast', 'Greek Yogurt', 1, '2024-09-27 08:15:30'),
--('user124', 'fdc790', '2024-09-27', 'lunch', 'Grilled Chicken Salad', 1, '2024-09-27 13:20:45'),
--('user125', 'fdc791', '2024-09-27', 'dinner', 'Salmon Fillet', 2, '2024-09-27 19:05:10'),
--('user126', 'fdc792', '2024-09-28', 'breakfast', 'Oatmeal', 1, '2024-09-28 07:45:00'),
--('user127', 'fdc793', '2024-09-28', 'lunch', 'Chicken Wrap', 1, '2024-09-28 12:30:15'),
--('user128', 'fdc794', '2024-09-28', 'dinner', 'Spaghetti Bolognese', 1, '2024-09-28 18:55:22'),
--('user129', 'fdc795', '2024-09-29', 'breakfast', 'Pancakes', 3, '2024-09-29 09:10:05'),
--('user130', 'fdc796', '2024-09-29', 'lunch', 'Caesar Salad', 1, '2024-09-29 13:45:30'),
--('user131', 'fdc797', '2024-09-29', 'dinner', 'Beef Stir Fry', 2, '2024-09-29 20:00:00'),
--('user132', 'fdc798', '2024-09-29', 'snack', 'Apple Slices', 1, '2024-09-29 15:25:10');


--INSERT INTO food_diary (keycloak_id, fdc_id, food_date, food_meal, food_name, food_qty, created_on)
--VALUES
--('user123', 'fdc789', '2024-09-29 09:10:05', 'breakfast', 'Greek Yogurt', 1, '2024-09-27'),
--('user123', 'fdc789', '2024-09-29 13:45:30', 'breakfast', 'Greek Yogurt', 1, '2024-09-27 08:15:30'),
--('user123', 'fdc789', '2024-09-29 20:00:00', 'breakfast', 'Greek Yogurt', 1, '2024-09-27 08:15:30'),
--('user123', 'fdc789', '2024-09-29 15:25:10', 'breakfast', 'Greek Yogurt', 1, '2024-09-27 08:15:30');


select * from food_diary where keycloak_id = 'user123';










