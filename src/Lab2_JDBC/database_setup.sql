-- UNIVERSITY STUDENT MANAGEMENT SYSTEM
-- LAB 2: Database setup
-- Database: university_management

-- 1.create students table

 create table students (
                          student_id serial primary key ,
                          name varchar (100) not null ,
                          email varchar(150) unique not null ,
                          phone_number varchar(20),
                          age int,
                          gpa numeric(3,2),
                          major varchar (100)
);
-- Add age validation
alter table students
    add constraint check_student_age
        check(age >= 16 AND age <= 100);

-- 2.create courses table


create table courses (
                       course_id serial primary key ,
                       name varchar(100) not null ,
                       course_code varchar(20) unique not null ,
                       credit_hours int not null
);
--3.Create enrollments


CREATE TABLE enrollments (
                             enrollment_id serial primary key ,
                             student_id int not null ,
                             course_id int not null ,
                             enrollment_date date default current_date,

                             foreign key (student_id) references students(student_id),
                             foreign key (course_id) references courses(course_id),

                             unique (student_id, course_id)
);