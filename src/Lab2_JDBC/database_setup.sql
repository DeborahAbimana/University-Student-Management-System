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
-- 2. CREATE COURSES TABLE

create table courses (
                       course_id serial primary key ,
                       name varchar(100) not null ,
                       course_code varchar(20) unique not null ,
                       credit_hours int not null
);