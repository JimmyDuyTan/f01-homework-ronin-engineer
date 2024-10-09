create database study_management;
use study_management;
drop table if exists student;

-- tao bang student
create table student(
                        id bigint primary key auto_increment,
                        name varchar(50) not null,
                        status varchar(20) not null,
                        username varchar(255) null,
                        password varchar(255) null,
                        created_date timestamp default current_timestamp not null,
                        updated_date timestamp null
);
use study_management;
-- tao bang admin
create table admin(
                      id bigint primary key auto_increment,
                      status varchar(50) not null,
                      username varchar(255) null,
                      password varchar(255) null,
                      created_date timestamp default current_timestamp not null,
                      updated_date timestamp null
);

-- tao bang teachers
create table teacher(
                        id bigint primary key auto_increment,
                        name varchar(50) not null,
                        status varchar(20) not null,
                        username varchar(255) null,
                        password varchar(255) null,
                        created_date timestamp default current_timestamp not null,
                        updated_date timestamp null
);

-- tao bang course
create table course(
                       id bigint primary key auto_increment,
                       title varchar(50) not null,
                       description varchar(50) null,
                       status varchar(20) not null,
                       created_date timestamp default current_timestamp not null,
                       updated_date timestamp null
);

-- tao table chapter
create table chapter(
                        id bigint primary key auto_increment,
                        title varchar(50) not null,
                        description varchar(50) null,
                        status varchar(20) not null,
                        created_date timestamp default current_timestamp not null,
                        updated_date timestamp null,
                        course_id bigint,
                        foreign key (course_id) references course (id)
);

-- tao table student_course
create table student_course(

                               student_id bigint,
                               course_id bigint,
                               rating DECIMAL(3, 2) NULL,
                               created_date timestamp default current_timestamp not null,
                               updated_date timestamp null,
                               PRIMARY KEY (student_id, course_id),
                               foreign key (student_id) references student (id),
                               foreign key (course_id) references course (id)
);
-- tao table teacher_course
CREATE TABLE teacher_course (
                                teacher_id BIGINT,
                                course_id BIGINT,
                                created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                updated_date TIMESTAMP NULL,
                                PRIMARY KEY (teacher_id, course_id),
                                FOREIGN KEY (teacher_id) REFERENCES teacher(id),
                                FOREIGN KEY (course_id) REFERENCES course(id)
);
use study_management;
-- Create table lesson
CREATE TABLE lesson (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        title VARCHAR(50) NOT NULL,
                        description VARCHAR(255) NULL,
                        chapter_id BIGINT,
                        created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                        updated_date TIMESTAMP NULL,
                        FOREIGN KEY (chapter_id) REFERENCES chapter(id)
);
-- them truong course_id vao bang lesson
use study_management;
alter table lesson
add column course_id bigint;

-- them khoa ngoai course_id vao bang lesson tham chieu toi bang course
use study_management;
alter table lesson
add foreign key (course_id) references course(id);

-- Create table student_lesson
CREATE TABLE student_lesson (
                                id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                student_id BIGINT,
                                lesson_id BIGINT,
                                is_completed BOOLEAN NOT NULL,
                                created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                updated_date TIMESTAMP NULL,
                                FOREIGN KEY (student_id) REFERENCES student(id),
                                FOREIGN KEY (lesson_id) REFERENCES lesson(id)
);
-- them truong course_id vao bang student_lesson
use study_management;
alter table student_lesson
add column course_id bigint;

-- them khoa ngoai course_id vao bang student_lesson tham chieu toi bang course
use study_management;
alter table student_lesson
add foreign key (course_id) references course(id);

-- 1.Truy vấn thông tin của sinh viên và số lượng khóa học sinh viên đã đăng ký
use study_management;
SELECT
    s.name AS student_name,
    COUNT(sc.course_id) AS total_courses
FROM
    student s
        INNER JOIN student_course sc ON s.id = sc.student_id
GROUP BY
    s.id, s.name;

-- 2.Truy vấn thông tin giáo viên và khóa học giáo viên đã dạy
use study_management;
select
    tc.name as teacher_name,
    COUNT(tcc.course_id) as total_courses
from
    teacher tc
        Inner join teacher_course tcc on tc.id = tcc.teacher_id
group by
    tc.name , tc.id;

-- 3.Truy vấn các khóa học có số lượng sinh viên đang học trên 10 người và đánh giá trung bình >= 4.0(thang điểm 5)


-- select theo column title của table course, tinh AVG cua rating theo tung mon, đếm số lượng sinh viên theo từng môn
-- liên kết 2 bảng course và student_course bằng khóa ngoại id của course và course_id của student_course
-- group by c.id để group theo từng môn học
-- having count(sc.student_id) > 10 để lọc ra các môn học có số lượng sinh viên học trên 10 người
use study_management;
SELECT c.title, AVG(sc.rating) AS average_rating, COUNT(sc.student_id) AS student_count
FROM course c
INNER JOIN student_course sc ON c.id = sc.course_id
GROUP BY c.id
HAVING COUNT(sc.student_id) > 10 AND AVG(sc.rating) >= 4.0;

-- 4.Truy vấn thông tin sinh viên và khóa học mà sinh viên đó đang học
-- select theo column name của table student, title của course, rating của student_course
-- liên kết 3 bảng student, course, student_course bằng khóa ngoại id của student_course và course_id của course
-- group by s.id để group theo từng sinh viên
use study_management;
SELECT s.name AS student_name, c.title AS course_title, sc.rating
FROM student s
INNER JOIN student_course sc ON s.id = sc.student_id
INNER JOIN course c ON c.id = sc.course_id
GROUP BY s.id;

-- 5.Truy vấn thông tin sinh viên và khóa học mà sinh viên đó đang học và có rating >= 4.0
-- select theo column name của table student, title của course, rating của student_course
-- liên kết 3 bảng student, course, student_course bằng khóa ngoại id của student_course và course_id của course
-- group by s.id để group theo từng sinh viên
-- dung where sc.rating >= 4.0 để lọc ra các sinh viên có rating >= 4.0

use study_management;
select
    s.name as student_name,
    c.title as course_title,
    sc.rating
from
    student_course sc
inner join student s on sc.student_id = s.id
inner join course c on sc.course_id = c.id
where sc.rating >= 4.0;

-- 6.Truy vấn thông tin sinh viên và khóa học mà sinh viên đó đang học và có rating >= 4.0 và sắp xếp theo rating giảm dần
-- select 3 thong tin name tu table student, title tu table course va rating tu table student_course
-- from bat dau truy van tu bang student_course
-- lien ket table student_course voi table student bang foreign key student_id
-- lien ket table student_course voi table course bang foreign key course_id
-- where loc ra sinh vien dang hoc va rating khoa hoc >= 4.0
-- order by student_course desc sap xep giam dan dua theo col rating
use study_management;
select
    s.name as student_name,
    c.title as course_title,
    sc.rating
from
    student_course sc
inner join student s on sc.student_id = s.id
inner join course c on sc.course_id = c.id
where sc.rating >= 4
order by sc.rating desc;

-- 7. truy vấn thông tin chi tiết về khóa học và chapter và số lượng bài học trong chapter
use study_management;
SELECT
    c.title AS tên_khóa_học,
    ch.title AS tên_chương,
    COUNT(l.id) AS số_lượng_bài_học
FROM
    course c
        INNER JOIN chapter ch ON c.id = ch.course_id
        INNER JOIN lesson l ON c.id = l.chapter_id
GROUP BY c.title, ch.title;

-- 8.  truy vấn thông tin chi tiết về khóa học và chapter và thông tin bài học và số lượng user đã hoàn thành bài học, và số lượng user đang học bài học.
-- 9. Hệ thống yêu cầu phải đánh dấu lại được các bài học(Lesson) nào mà sinh viên đã học qua, Bạn hãy  thiết kế thêm vào  CSDL ở trên để đáp ứng bài toán này.
use study_management;

SELECT
    c.title AS tên_khóa_học,
    ch.title AS tên_chương,
    l.title AS tên_bài_học,
    COUNT(CASE WHEN sl.is_completed = TRUE THEN 1 END) AS số_lượng_người_hoàn_thành,
    COUNT(CASE WHEN sl.is_completed = FALSE THEN 1 END) AS số_lượng_người_đang_học
FROM
    course c
        INNER JOIN chapter ch ON c.id = ch.course_id
        INNER JOIN lesson l ON ch.id = l.chapter_id
        LEFT JOIN student_lesson sl ON l.id = sl.lesson_id
GROUP BY
    c.title, ch.title, l.title;