create table students(
id int primary key,
name varchar(50) not null,
email varchar(50) unique,
age int,
marks decimal(6,2)
)
insert into students values (1,'pratham','prathamprathu@gmail.com',21,90.00);
insert into students values(2,'rahul','rahulprathu@gmail.com',22,91.00);
insert into students values(3,'kusuma','kusumaprathu@gmail.com',21,90.00);
insert into students values(4,'suresh','sureshprathu@gmail.com',17,90.00);
insert into students values(5,'poojitha','poojithaprathu@gmail.com',21,90.00);
select*from students
select *from students where age>21
update students set email='rahul@gmail.com' where id=5
delete from students where age<18; 
select*from students order by marks desc limit 1 offset 1
create table Student(
id int primary key,
name varchar(50),
age int
)
create table courses(
course_id int,
id int,
foreign key (id) references Student(id),
course_name varchar(50)
)
insert into Student values(1,'rahul',22);
insert into Student values(2,'Priya',21);
insert into Student values(3,'Akash',23);
 select *from Student
 insert into courses values(101,1,'java');
 insert into courses values(102,2,'python');
 insert into courses values(103,1,'sql');
 select *from courses
 select 
 
 
