-- tao bang student
use quanlyhocsinh;
CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    class VARCHAR(10),
    math_score DECIMAL(3, 2),
    literature_score DECIMAL(3, 2),
    english_score DECIMAL(3, 2),
    total_score DECIMAL(4, 2)
);


use quanlyhocsinh;
DELIMITER $$
CREATE PROCEDURE insert_students(IN count INT)
BEGIN
    DECLARE i INT DEFAULT 1;
    WHILE i <= count DO
            INSERT INTO student (name, age, class, math_score, literature_score, english_score, total_score)
            VALUES
                (CONCAT('Student_', i),
                 FLOOR(RAND() * 2) + 13,  -- Tuổi từ 15 đến 17
                 CONCAT(FLOOR(RAND() * 3) + 10, CHAR(65 + FLOOR(RAND() * 26))),
                 FLOOR(RAND() * 11),
                 FLOOR(RAND() * 11),
                 FLOOR(RAND() * 11),
                 FLOOR(RAND() * 33)
                );
            SET i = i + 1;
        END WHILE;
END $$
DELIMITER ;
CALL insert_students(100);

-- Thêm 100 học sinh vào bảng:
INSERT INTO student (name, age, class, math_score, literature_score, english_score, total_score)
VALUES
('Student1', 15, '10A', 8.5, 7.0, 9.0, 24.5),
('Student2', 16, '11B', 6.0, 8.0, 7.5, 21.5),
-- Thêm các học sinh khác tương tự
-- ...
('Student100', 17, '12C', 9.0, 8.5, 9.5, 27.0);


-- Tìm danh sách các lớp học hiện có trong bảng:
SELECT DISTINCT class FROM student;

-- Đếm số học sinh trong bảng:
SELECT COUNT(*) FROM student;

-- Tính tổng điểm các môn (Toán, Văn, Anh) của tất cả học sinh
SELECT
    SUM(math_score) AS total_math_score,
    SUM(literature_score) AS total_literature_score,
    SUM(english_score) AS total_english_score
FROM student;

-- Tính điểm trung bình các môn (Toán, Văn, Anh) của tất cả học sinh:
SELECT
    AVG(math_score) AS avg_math_score,
    AVG(literature_score) AS avg_literature_score,
    AVG(english_score) AS avg_english_score
FROM student;

-- Tìm điểm cao nhất của từng môn theo từng lớp:
SELECT
    class,
    MAX(math_score) AS max_math_score,
    MAX(literature_score) AS max_literature_score,
    MAX(english_score) AS max_english_score
FROM student
GROUP BY class;

-- Tìm điểm thấp nhất của từng môn theo từng lớp:
SELECT
    class,
    MIN(math_score) AS min_math_score,
    MIN(literature_score) AS min_literature_score,
    MIN(english_score) AS min_english_score
FROM student

-- Tìm học sinh có tên bắt đầu với chữ cái 'A':
GROUP BY class;SELECT * FROM student WHERE name LIKE 'A%';

-- Tìm học sinh có điểm môn Toán là 9 hoặc 10:
SELECT * FROM student WHERE math_score IN (9, 10);

-- Lấy thông tin học sinh và sắp xếp theo điểm tổng kết từ cao đến thấp theo từng khối:
SELECT * FROM student ORDER BY class, total_score DESC;

-- Lấy thông tin 5 học sinh đầu tiên trong bảng có điểm tổng kết tổng cao nhất theo thứ tự cao đến thấp:
SELECT * FROM student ORDER BY total_score DESC LIMIT 5;

-- Tìm học sinh có điểm môn Văn >= 8 và điểm môn Anh < 6:
SELECT * FROM student WHERE literature_score >= 8 AND english_score < 6;

-- Tìm học sinh có điểm môn Toán < 5 hoặc điểm tổng kết tổng < 10:
SELECT * FROM student WHERE math_score < 5 OR total_score < 10;

-- Cập nhật lớp mới cho các học sinh đủ điều kiện lên lớp (điểm tổng kết >= 5 và không có điểm các môn nào = 0):
UPDATE student
SET class = 'new_class'
WHERE total_score >= 5 AND math_score > 0 AND literature_score > 0 AND english_score > 0;