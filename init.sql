CREATE TABLE foods (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    calories INTEGER NOT NULL,
    protein FLOAT NOT NULL,
    carbohydrates FLOAT NOT NULL,
    fat FLOAT NOT NULL
);

INSERT INTO foods (name, calories, protein, carbohydrates, fat) VALUES
('Manzana', 52, 0.3, 14, 0.2),
('Banana', 96, 1.3, 27, 0.3),
('Naranja', 43, 0.9, 9, 0.1);
