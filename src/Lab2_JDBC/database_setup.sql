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
--3.Create table enrollments


create table  enrollments (
                             enrollment_id serial primary key ,
                             student_id int not null ,
                             course_id int not null ,
                             enrollment_date date default current_date,

                             foreign key (student_id) references students(student_id),
                             foreign key (course_id) references courses(course_id),

                             unique (student_id, course_id)
);
--4.insert student records

insert into students (name, email, phone_number, age, gpa, major)
values
    ('Deborah', 'debah100@gmail.com', '+250792566790', 20, 3.50, 'Cybersecurity'),
    ('Hanah', 'hanah160@gmail.com', '+25079996640', 27, 3.10, 'Networking'),
    ('Grace', 'grac190@gmail.com', '+250792092790', 25, 3.00, 'Computer Science'),
    ('Eric', 'eric198@gmail.com', '+250788111111', 22, 3.20, 'Software Engineering'),
    ('Alice', 'ali638@gmail.com', '+250788222222', 21, 3.80, 'Cybersecurity'),
    ('David', 'dav897@gmail.com', '+250788333333', 24, 3.40, 'Networking'),
    ('Diana', 'dia538@gmail.com', '+250788444444', 23, 3.90, 'Computer Science'),
    ('Peter', 'pet738@gmail.com', '+250788555555', 26, 3.10, 'Information Technology'),
    ('Sarah', 'sarh638@gmail.com', '+250788666666', 20, 3.60, 'Software Engineering'),
    ('James', 'jams637@gmail.com', '+250788777777', 25, 3.30, 'Data Science');

--5.Insert course records

insert into courses (name, course_code, credit_hours)
values
    ('Data Communication', 'DT109', 5),
    ('Java', 'JV177', 6),
    ('Database Management Systems', 'DB201', 5),
    ('Computer Networks', 'CN202', 4),
    ('Object Oriented Programming', 'OOP203', 6);

-- 6. Insert student enrollments

insert into enrollments (student_id, course_id)
select  s.student_id, c.course_id
from (values
          ('debah100@gmail.com', 'DT109'),
          ('debah100@gmail.com', 'JV177'),
          ('debah100@gmail.com', 'DB201'),
          ('hanah160@gmail.com', 'CN202'),
          ('hanah160@gmail.com', 'JV177'),
          ('grac190@gmail.com', 'OOP203'),
          ('grac190@gmail.com', 'DB201'),
          ('eric198@gmail.com', 'JV177'),
          ('eric198@gmail.com', 'CN202'),
          ('ali638@gmail.com', 'DT109'),
          ('ali638@gmail.com', 'OOP203'),
          ('dav897@gmail.com', 'CN202'),
          ('dia538@gmail.com', 'DB201'),
          ('pet738@gmail.com', 'OOP203'),
          ('sarh638@gmail.com', 'JV177')
     ) as e(student_email, course_code)
         inner join students s
                    on s.email = e.student_email
         inner join courses c
                    on c.course_code = e.course_code;