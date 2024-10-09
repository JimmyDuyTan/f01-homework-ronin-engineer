use study_management;
-- Thêm dữ liệu vào bảng student
INSERT INTO student (name, status, username, password)
VALUES
('Student1', 'active', 'student1', 'password1'),
('Student2', 'active', 'student2', 'password2'),
('Student3', 'inactive', 'student3', 'password3'),
('Student4', 'inactive', 'student4', 'password4'),
('Student5', 'inactive', 'student5', 'password5'),
('Student6', 'inactive', 'student6', 'password6'),
('Student7', 'active', 'student7', 'password7'),
('Student8', 'active', 'student8', 'password8'),
('Student9', 'active', 'student9', 'password 9'),
('Student10', 'active', 'student10', 'password10'),
('Student11', 'active', 'student11', 'password11'),
('Student12', 'active', 'student12', 'password12'),
('Student13', 'active', 'student13', 'password13'),
('Student14', 'active', 'student14', 'password14'),
('Student15', 'active', 'student15', 'password15'),
('Student16', 'active', 'student16', 'password16'),
('Student17', 'active', 'student17', 'password17'),
('Student18', 'active', 'student18', 'password18'),
('Student19', 'active', 'student19', 'password19'),
('Student20', 'active', 'student20', 'password20');
-- Thêm dữ liệu vào bảng admin
INSERT INTO admin (status, username, password)
VALUES
('active', 'admin1', 'adminpassword1'),
('inactive', 'admin2', 'adminpassword2');

-- Thêm dữ liệu vào bảng teacher
INSERT INTO teacher (name, status, username, password)
VALUES
('Teacher1', 'active', 'teacher1', 'password1'),
('Teacher2', 'active', 'teacher2', 'password2'),
('Teacher3', 'inactive', 'teacher3', 'password3'),
('Teacher4', 'active', 'teacher4', 'password4'),
('Teacher5', 'inactive', 'teacher5', 'password5'),
('Teacher6', 'active', 'teacher6', 'password6');

-- Thêm dữ liệu vào bảng course
INSERT INTO course (title, description, status)
VALUES
('Math', 'Mathematics Course', 'active'),
('Literature', 'Literature Course', 'active'),
('Science', 'Science Course', 'inactive');

-- Thêm dữ liệu vào bảng chapter
INSERT INTO chapter (title, description, status, course_id)
VALUES
('Chapter 1', 'Introduction to Math', 'active', 1),
('Chapter 2', 'Advanced Math', 'active', 1),
('Chapter 1', 'Introduction to Literature', 'active', 2),
('Chapter 2', 'Advanced Literature', 'active', 2),
('Chapter 1', 'Introduction to Science', 'active', 3),
('Chapter 2', 'Advanced Science', 'active', 3);

-- Thêm dữ liệu vào bảng student_course
INSERT INTO student_course (student_id, course_id, rating)
VALUES
(1, 1, 4.5),
(2, 2, 3.8),
(3, 3, 4.2),
(4, 2, 4.0),
(5, 1, 3.5),
(6, 1, 3.5),
(7, 3, 4.8),
(8, 2, 4.2),
(9, 3, 4.3),
(10, 2, 3.6),
(11, 3, 4.5),
(12, 3, 3.8),
(13, 3, 3.2),
(14, 2, 2.9),
(15, 2, 4.6),
(16, 1, 4.4),
(17, 1, 4.9),
(18, 1, 4.7),
(19, 1, 4.6),
(20, 1, 4.7);

-- Thêm dữ liệu vào bảng teacher_course
INSERT INTO teacher_course (teacher_id, course_id)
VALUES
(1, 1),
(1, 2),
(2, 2),
(2, 3),
(3, 1),
(3, 3),
(4, 1),
(4, 2),
(4, 3),
(5, 3),
(6, 1),
(6, 3);

-- them du lieu vao bang lesson
use study_management;
insert into lesson(title ,description, chapter_id)
values
('lesson_1' , 'C.1' , 1),
('lession_2', 'C.2', 1),
('lession_1', 'C.1', 2),
('lession_2', 'C.2', 2),
('lession_1', 'C.1', 3),
('lession_2', 'C.2', 3);
-- them du lieu vao col course_id cua bang lesson do chua co du lieu
use study_management;
update lesson set course_id = 1 where id = 1;
update lesson set course_id = 1 where id = 2;
update lesson set course_id = 1 where id = 3;
update lesson set course_id = 1 where id = 4;
update lesson set course_id = 2 where id = 5;
update lesson set course_id = 2 where id = 6;

-- them du lieu vao bang lesson
use study_management;
insert into lesson(title ,description, chapter_id, course_id)
values
('lesson_1' , 'C.1' , 4, 2),
('lesson_2', 'C.2', 4, 2),
('lesson_1', 'C.1', 5, 3),
('lesson_2', 'C.2', 5, 3),
('lesson_1', 'C.1', 6, 3),
('lesson_2', 'C.2', 6, 3);


-- them du lieu vao bang student_lesson
use study_management;
insert into student_lesson(student_id, lesson_id, is_completed, course_id)
values
(1, 1, True, 1),
(2, 5, True, 2),
(3, 9, True, 3),
(4, 6, True, 2),
(5, 4, True, 1),
(6, 3, FALSE, 1),
(7, 10, True, 3),
(8, 8, True, 2),
(9, 11, True, 3),
(10, 7, True, 2),
(11, 11, True, 3),
(12, 12, True, 3),
(13, 10, FALSE, 3),
(14, 5, FALSE, 2),
(15, 7, True, 2),
(16, 1, FALSE, 1),
(17, 2, True, 1),
(18, 3, FALSE, 1),
(19, 3, True, 1),
(20, 4, FALSE, 1);

