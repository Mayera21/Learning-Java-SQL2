CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    marks INT
);
INSERT INTO Student (id,name,marks) VALUES
(1, 'Alice', 85),
(2, 'Bob', 90),
(3, 'Charlie', 78),
(4, 'David', 92),
(5, 'Eve', 88);
SELECT * FROM Student;
SELECT id, name, marks,
        CASE 
            WHEN marks >= 90 THEN 'A'
            WHEN marks >= 80 THEN 'B'
            WHEN marks >= 70 THEN 'C'
            ELSE 'D'
            END AS grade
FROM Student;


UPDATE student
SET marks = 72
WHERE id = 3;

DELETE FROM student
WHERE id = 2;



SELECT * FROM Student
ORDER BY marks ASC;